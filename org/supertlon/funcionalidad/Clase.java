package org.supertlon.funcionalidad;


import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
public class Clase{

    public static String crearClase(String nombreProfe, String sede, int horaIni, int horaFin, LocalDate fecha, String diaDeClase, boolean onl, String tipoEj, int cantAlum, String online) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String tipoEjercicio;
    private Sede sede;
    Stock stockNecesario = new Stock();
    private int cantAlumnos;
    private estadoClase estado;
    private Profesor profesor;
    private boolean esOnline;
    private int horaInicio;
    private int horaFin;
    private Emplazamiento lugar;
    private List<Articulo> articulos;
    private int rentabilidad;
    private int costo;
    private int ingreso;
    private DateFormat dia;
    private NivelMembresia nivelMembresia;
    private Date diad;
    
    public Clase(Profesor profesor, Sede sede, DateFormat dia, int horaInicio, int horaFin){
        
        this.profesor = profesor;
        this.sede = sede;
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        
    }
    
    public Clase(Date diad, int horaInicio, int horaFin){
        this.diad = diad;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }
    public Clase(Profesor profesor, Sede sede, int horaInicio, int horaFin, DateFormat dia, String tipoEjercicio, boolean esOnline, Emplazamiento lugar, int cantAlumnos, NivelMembresia nivelMembresia) {
        this.profesor = profesor;
        this.horaFin = horaFin;
        this.horaInicio = horaInicio;
        this.dia = dia;
        profesor.aumentarCantClases();
        profesor.agregarClase(this);
        this.sede = sede;
        this.tipoEjercicio = tipoEjercicio;
        this.nivelMembresia = nivelMembresia;
        this.esOnline = esOnline;
        this.lugar = lugar;
        this.cantAlumnos = cantAlumnos;
        this.estado = estadoClase.agendada;
        if(this.calcularRentabilidad() > 0){
           this.estado = estadoClase.confirmada;
        }

    }

    public Clase(Supertlon controlador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Clase(String nombreProfe, String sede, int horaIni, int horaFin, LocalDate fecha, String tipoEj, boolean onl, String emoplazamiento, int cantAlum, String membresia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public int getCantAlumnos(){
        return this.cantAlumnos;
    }
    public void agendarAlumno(){
        this.cantAlumnos+=1;
    }
    public void desagendarAlumno(){
        this.cantAlumnos-=1;
    }
    public estadoClase getestadoClase() {
        return this.estado;
    }
    public boolean getEsOnline() {
        return this.esOnline;
    }
    public int getComienzoClase() {
        return this.horaInicio;
    }
    public void setComienzoClase(int comienzoClase) {
        this.horaInicio = comienzoClase;
    }
    public int getTerminaClase() {
        return this.horaFin;
    }
    public void setTerminaClase(int terminaClase) {
        this.horaFin = terminaClase;
    }
    public int calcularRentabilidad() {
        int rentabilidad = getIngreso() - getCosto();
        if(rentabilidad >0 ){
            this.estado = estadoClase.confirmada;
        }
        return rentabilidad;
    }
    public int getCosto() {
        int costo = (profesor.getSueldo())/90;
        if(lugar.toString().equals("Salon")){
            costo+= (lugar.getAlquiler())/300;
        }
        else if(lugar.toString().equals("Pileta")){
            costo+= (lugar.getAlquiler())/150;
        }
        else if(lugar.toString().equals("AireLibre")){
            costo+= 500* lugar.getMts2();
        }
        return costo;
    }
    public int getIngreso() {
        return (nivelMembresia.getCostoMembresia()/30)*cantAlumnos;
    }
    public DateFormat getDia(){
        return this.dia;
    }
    public enum estadoClase {
        agendada,
        confirmada,
        finalizada
    }
    public enum sedes {
        Belgrano,
        Recoleta
    }
    
      public Date getDiad(){
        return diad;
    }
      
     public void setSede(Sede sede) {
        this.sede = sede;
    }

}