package org.supertlon.funcionalidad;

import java.text.DateFormat;
import supertlon.vistas.*;

public class main {
    private static Supertlon controlador;
    
    public static void main(String[] args) throws NoSePuedeCrearClaseException {
        controlador = new Supertlon();
        NivelMembresia Oro = controlador.crearNivelMembresia("Black", 1, 100);
        NivelMembresia Black = controlador.crearNivelMembresia("Oro", 2, 200);
        NivelMembresia Platinum = controlador.crearNivelMembresia("Platinum", 3, 300);
        controlador.agregarClaseOnline("Yoga");
        controlador.agregarClaseOnline("Gimnasia postural");
        controlador.agregarNivelMembresia(Oro);
        controlador.agregarNivelMembresia(Black);
        controlador.agregarNivelMembresia(Platinum);
        Sede Belgrano = controlador.crearSede("Belgrano", 70, Black);
        Sede Recoleta = controlador.crearSede("Recoleta", 100, Oro);
        Sede as = controlador.crearSede("Mamba",20,Oro);
        Profesor Julian = controlador.crearProfesor("Julian", 100);
        controlador.agregarProfesor(Julian);
        Profesor Agustin = controlador.crearProfesor("Agustin", 100);
        controlador.agregarProfesor(Agustin);
        Alumno Felipe = controlador.crearAlumno("Felipe", "Platinum");
        Articulo PesaMano = controlador.crearArticulo("PesaMano",100,4);
        Articulo PesaDisco = controlador.crearArticulo("PesaDisco",110,6);
        Articulo PesaTobillera = controlador.crearArticulo("PesaTobillera",90,5);
        Articulo Colchoneta1 = controlador.crearArticulo("Colchoneta1",70,2);
        Articulo Colchoneta2 = controlador.crearArticulo("Colchoneta1",75,5);
        Articulo Botas = controlador.crearArticulo("Botas",170,12);
        controlador.agregarEjercicio("Crossfit");
        controlador.agregarEjercicio("Gimnasia postural");
        controlador.agregarEjercicio("Yoga");
        controlador.agregarEjercicio("Kangoo jumping");
        controlador.agregarEjercicio("Aero combat");
        Belgrano.stockDisponible.setPesaMano(80);
        Belgrano.stockDisponible.setPesaTobillera(86);
        Belgrano.stockDisponible.setPesaDisco(70);
        Belgrano.stockDisponible.setColchoneta1(90);
        Belgrano.stockDisponible.setColchoneta2(87);
        Belgrano.stockDisponible.setBotas(75);
        controlador.agregarSede(Belgrano);
        controlador.agregarSede(Recoleta);
        Emplazamiento Pileta = controlador.crearEmplazamiento("Pileta", 20, 25, Belgrano);
       Object clase1 = controlador.crearClase(
    Julian, 
    Belgrano,
    10,  // horaInicio
    14, // horaFin
    DateFormat.getDateInstance(), // Usando getDateInstance para obtener una instancia de fecha válida
    "Crossfit", 
    false,
    Pileta,
    20,
    Platinum);
    
        
        controlador.inicializarNivelesMembresia();
        controlador.imprimirSedes();
        
        GestionUsuario gestionUsuario = new GestionUsuario(controlador);  // Modificar esta línea
        
        Menu controller = new Menu(controlador);
        controller.setVisible(true);
        controller.setLocationRelativeTo(null);
        
        
     
    }
}
