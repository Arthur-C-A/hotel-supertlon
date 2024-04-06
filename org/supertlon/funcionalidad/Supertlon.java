package org.supertlon.funcionalidad;


import java.text.DateFormat;
import java.util.*;

public class Supertlon{

    
    private List<Sede> sedes;
    private List<NivelMembresia> nivelesMembresia = new ArrayList<>();
    private Alumno alumno;
    private List<Profesor> profesor = new ArrayList<>();
    private List<Articulo> articulos = new ArrayList<>();
    private Emplazamiento emplazamiento;
    private Clase clase;
    private List<String> ejercicios = new ArrayList<>();
    private List<String> clasesOnline = new ArrayList<>();
    private List<Clase> clasesYoga = new ArrayList<>();
    private List<Clase> clasesGimnsasiaPostural = new ArrayList<>();
    Map<String, Integer> diccionarioNivelMembresia = new HashMap<>();
    
    public Supertlon(List<Sede> sedes) {
        this.sedes = sedes;
        this.nivelesMembresia = new ArrayList<>();
        // Resto de la inicialización...
    }
    
  
    
    public String crearClase(Profesor profesor, Sede sede, int horaInicio, int horaFin,
                            DateFormat dia, String tipoEjercicio, boolean esOnline, Emplazamiento lugar,
                            int cantAlumnos, NivelMembresia nivelMembresia) throws NoSePuedeCrearClaseException {
        Clase nuevaClase = new Clase(profesor, sede, horaInicio, horaFin, dia, tipoEjercicio,
                esOnline, lugar, cantAlumnos, nivelMembresia);

        //EJERCICIO EXISTE?
        if (!ejercicios.contains(tipoEjercicio)) {
            throw new NoSePuedeCrearClaseException("La clase no puede iniciarse, el ejercicio no está disponible en nuestro gimnasio");
        }

        //SI EXISTE, DESIGNACION DE STOCK NECESARIO
        else if(tipoEjercicio.equals("Crossfit")){
            nuevaClase.stockNecesario.setPesaMano((2*cantAlumnos)+1);
            nuevaClase.stockNecesario.setPesaTobillera((2*cantAlumnos)+1);
            nuevaClase.stockNecesario.setPesaDisco((cantAlumnos)+1);
        }
        else if(tipoEjercicio.equals("Yoga")){
            nuevaClase.stockNecesario.setColchoneta1(1);
            nuevaClase.stockNecesario.setColchoneta2(cantAlumnos);
        }
        else if (tipoEjercicio.equals("Kangoo jumping")){
            nuevaClase.stockNecesario.setColchoneta1(1);
            nuevaClase.stockNecesario.setColchoneta2(cantAlumnos);
            nuevaClase.stockNecesario.setBotas(cantAlumnos+1);
        }
        else if(tipoEjercicio.equals("Gimnasia postural")){
            nuevaClase.stockNecesario.setColchoneta1(1);
            nuevaClase.stockNecesario.setColchoneta2(cantAlumnos);
        }
        else{
            nuevaClase.stockNecesario.setColchoneta1(1);
            nuevaClase.stockNecesario.setColchoneta2(cantAlumnos);
            nuevaClase.stockNecesario.setPesaMano((2*cantAlumnos)+1);
        }

        // CONTROL DE STOCK
        if(nuevaClase.stockNecesario.getBotas() > sede.stockDisponible.getBotas()||
                nuevaClase.stockNecesario.getColchoneta1() > sede.stockDisponible.getColchoneta1() ||
                nuevaClase.stockNecesario.getColchoneta2() > sede.stockDisponible.getColchoneta2() ||
                nuevaClase.stockNecesario.getPesaDisco() > sede.stockDisponible.getPesaDisco() ||
                nuevaClase.stockNecesario.getPesaMano() > sede.stockDisponible.getPesaMano() ||
                nuevaClase.stockNecesario.getPesaTobillera() > sede.stockDisponible.getPesaTobillera()){
            throw new NoSePuedeCrearClaseException("La clase no puede iniciarse, no hay stock disponible");
        }

        //PROFESOR
        else if(profesor.getCantClases()>1) {
            boolean distanciaClasesProfesor = true;
            for (int i = 0; i < profesor.enQueClasesEsta().size() - 1; i++) { //Verifica que haya 3hs entre clases
                int finClaseActual = profesor.enQueClasesEsta().get(i).getTerminaClase();
                int inicioProximaClase = profesor.enQueClasesEsta().get(i + 1).getComienzoClase();
               if (inicioProximaClase - finClaseActual < 3) {
                    distanciaClasesProfesor = false; // Hay menos de 3 horas entre clases
                   throw new NoSePuedeCrearClaseException("La clase no puede iniciarse, hay diferencia de menos de 3hs entre clases");
               }
            }
        }
        else if(profesor.getCantClases()>3){
            profesor.disminuirCantClases(); //sacamos la clase agregada previamente para realizar las comparaciones, ya que esta clase no va a ser inicializada
            profesor.quitarClase(nuevaClase);
            throw new NoSePuedeCrearClaseException("La clase no puede iniciarse, el profesor ya da 3 clases por dia");
        }

        //NIVEL DE MEMBRESIA ACEPTADO EN SEDE?
        else if(nivelMembresia.getPrestigio() < sede.nivelMinimoMembresia.getPrestigio()){
            throw new NoSePuedeCrearClaseException("La clase no puede iniciarse, el nivel de membresia del socio es menor al minimo aceptado");
        }

        //ES RENTABLE?
        else if(nuevaClase.calcularRentabilidad() < 0){
            throw new NoSePuedeCrearClaseException("La clase no puede iniciarse, no es rentable");
        }

        //ES ONLINE? (Solo YOGA y GIMNASIA POSTURAL pueden serlo)
        else if (esOnline) {
            if (!clasesOnline.contains(tipoEjercicio)){
                throw new NoSePuedeCrearClaseException("La clase no puede iniciarse, no hay clases online para " + tipoEjercicio);
            }
        }

        //MAX 10 CLASES YOGA
        else if(tipoEjercicio.equals("Yoga")) {
            if (clasesYoga.size() >= 10) {
                clasesYoga.remove(clasesYoga.get(0)); //Si ya hay 10, borro la primera
            }
            clasesYoga.add(nuevaClase); //Siempre agrego la nueva
        }

        //MAX 15 CLASES GIMNASIA POSTURAL
       else if(tipoEjercicio.equals("Gimnasia postural")) {
        if (clasesGimnsasiaPostural.size() >= 15) {
            clasesGimnsasiaPostural.remove(clasesGimnsasiaPostural.get(0)); //Si ya hay 15, borro la primera
        }
        clasesGimnsasiaPostural.add(nuevaClase); //Siempre agrego la nueva
        }

        //CANT ALUMNOS
        else if(cantAlumnos>30 && !esOnline){
            throw new NoSePuedeCrearClaseException("La clase no puede iniciarse, la cantidad de alumnos supera el limite");
        }
        else{
            System.out.println("Clase creada correctamente");
            //SI ESTA TO.DO BIEN SE RESTA DEL STOCK DISPONIBLE LO Q SE USE
            sede.stockDisponible.setPesaMano(sede.stockDisponible.getPesaMano()-nuevaClase.stockNecesario.getPesaMano());
            sede.stockDisponible.setPesaDisco(sede.stockDisponible.getPesaDisco()-nuevaClase.stockNecesario.getPesaDisco());
            sede.stockDisponible.setPesaTobillera(sede.stockDisponible.getPesaTobillera()-nuevaClase.stockNecesario.getPesaTobillera());
            sede.stockDisponible.setBotas(sede.stockDisponible.getBotas()-nuevaClase.stockNecesario.getBotas());
            sede.stockDisponible.setColchoneta1(sede.stockDisponible.getColchoneta1()-nuevaClase.stockNecesario.getColchoneta1());
            sede.stockDisponible.setColchoneta2(sede.stockDisponible.getColchoneta2()-nuevaClase.stockNecesario.getColchoneta2());
        }

        return "Clase creada correctamente";
    }


    public Emplazamiento crearEmplazamiento(String nombre, int Precioalquiler, int Mts2, Sede sede){
        return new Emplazamiento(nombre, Precioalquiler, Mts2, sede);
    }
    public Articulo crearArticulo(String nombre, int clasesDeUsabilidad, int precio){
        return new Articulo(nombre, clasesDeUsabilidad);
    }
    public Profesor crearProfesor(String nombre, int sueldo) {
        return new Profesor(nombre, sueldo);
    }
    
    public List<Profesor> getProfesores() {
    return this.profesor;
}
    public void agregarProfesor(Profesor profesor) {
        this.profesor.add(profesor);
    }
    public List<Articulo> getArticulos() {
    Articulo colchoneta = new Articulo("Colchoneta Alta Densidad", 0);
    Articulo pesaTobillera = new Articulo("Pesa Tobillera", 0);

    articulos.add(colchoneta);
    articulos.add(pesaTobillera);
        return this.articulos;
    }
    public Alumno crearAlumno(String nombre, String nivelMembresia){
        return new Alumno(nombre, nivelMembresia);
    }
    public String inscribirAlumno(Alumno alumno, Clase clase){
        //Verifica que el alumno no este ya en una clase ese dia
        if(!alumno.getDiasDeClase().contains(clase.getDia())) {
            clase.agendarAlumno();
            return ("Inscripcion exitosa");
        }
        else {
            return ("Las condiciones para inscribir al alumno no se cumplen");
        }
    }
    public Supertlon() {
        this.sedes = new ArrayList<>();
        this.nivelesMembresia = new ArrayList<>();
        inicializarNivelesMembresia();
        
    }
    
    public NivelMembresia crearNivelMembresia(String nombre, int prestigio, int costo) {
        return new NivelMembresia(nombre, prestigio, costo);
    }
    public void agregarNivelMembresia(NivelMembresia nivel) {
        diccionarioNivelMembresia.put(nivel.getNombre(), nivel.getPrestigio());
    }

    public List<NivelMembresia> getNivelesMembresia() {
        return this.nivelesMembresia;
    }

    public Sede crearSede(String nombre, int capacidad, NivelMembresia nivelMinimoMembresia) {
        return new Sede(nombre, capacidad, nivelMinimoMembresia);
    }
    
    public void agregarSede(Sede sede) {
        sedes.add(sede);
    }
    public List<Sede> getSedes() {
        return sedes;
    }
    
    public Map<String, Integer> getDiccionarioNivelMembresia() {
    return diccionarioNivelMembresia;
}
    
    public void inicializarNivelesMembresia() {
     if (this.nivelesMembresia.isEmpty()) {
        NivelMembresia nivel1 = crearNivelMembresia("Black", 1, 100);
        NivelMembresia nivel2 = crearNivelMembresia("Oro", 2, 200);
        NivelMembresia nivel3 = crearNivelMembresia("Platinum", 3, 300);

        agregarNivelMembresia(nivel1);
        agregarNivelMembresia(nivel2);
        agregarNivelMembresia(nivel3);

        // Actualiza la lista nivelesMembresia
        this.nivelesMembresia.add(nivel1);
        this.nivelesMembresia.add(nivel2);
        this.nivelesMembresia.add(nivel3);
    }
}
    
    
    public NivelMembresia buscarNivelMembresiaPorNombre(String nombre) {
    for (NivelMembresia nivel : nivelesMembresia) {
        if (nivel.getNombre().equals(nombre)) {
            return nivel;
        }
    }
    return null;
    }
    
    public void borrarProfesor(String nombre) {
        List<Profesor> profesor = getProfesores();
        
        Optional<Profesor> ProfesorAEliminar = profesor.stream()
                .filter(profesores -> profesores.getNombre().equals(nombre))
                .findFirst();

        ProfesorAEliminar.ifPresent(profesor::remove);
    }
    
    public void borrarMembresia(String nombre) {
        List<NivelMembresia> niveles = getNivelesMembresia();
        
        Optional<NivelMembresia> NivelAEliminar = niveles.stream()
                .filter(nivel -> nivel.getNombre().equals(nombre))
                .findFirst();

        NivelAEliminar.ifPresent(niveles::remove);
    }
    public void borrarSede(String nombre) {
        List<Sede> sedes = getSedes();

        Optional<Sede> sedeAEliminar = sedes.stream()
                .filter(sede -> sede.getNombre().equals(nombre))
                .findFirst();

        sedeAEliminar.ifPresent(sedes::remove);
    }
    
    public boolean existeSede(String nombre) {
        for (Sede sede : sedes) {
            if (sede.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
    
    public void agregarClaseOnline(String tipoejercicio){
        clasesOnline.add(tipoejercicio);
    }
    public List<String> getClasesOnline() {
        return this.clasesOnline;
    }

    public void agregarEjercicio(String ejercicio){
        this.ejercicios.add(ejercicio);
    }
    public void eliminarEjercicio(String ejercicio){
        this.ejercicios.remove(ejercicio);
    }
    public List<String> getEjercicios(){
        return this.ejercicios;
    }
    public void mostrarEjercicios(){
        for(String elemento : ejercicios){
            System.out.println(elemento);
        }
    }
    public void imprimirSedes() {
    for (Sede sede : sedes) {
    }  
}
    
    public void borrarArticulo(String nombre) {
    List<Articulo> articulos = getArticulos();
    System.out.println("Lista de artículos antes de la eliminación: " + articulos);

    Optional<Articulo> articuloAEliminar = articulos.stream()
            .filter(articulo -> articulo.getNombre().equals(nombre))
            .findFirst();

    articuloAEliminar.ifPresent(articulos::remove);
    System.out.println("Lista de artículos después de la eliminación: " + articulos);

}
    
    
}