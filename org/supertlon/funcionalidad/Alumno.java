package org.supertlon.funcionalidad;

import java.text.DateFormat;
import java.util.*;


public class Alumno {
    private String nombre;
    private List<DateFormat> diasDeClase;
    private String nivelMembresia;
    public Alumno(String nombre, String nivelMembresia) {
        this.nombre = nombre;
        this.diasDeClase = new ArrayList<>();
        this.nivelMembresia = nivelMembresia;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public String getDatos(){
        
        return nombre + " " + nivelMembresia;
        
    }
    
    public List<DateFormat> getDiasDeClase(){
        return this.diasDeClase;
    }
    
    public String getMembresia(){
        return this.nivelMembresia;
    }
}
