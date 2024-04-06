package org.supertlon.funcionalidad;

import java.util.*;
public class Sede {

    private String nombre;
    private List<Clase> ListaClases;
    private String Socio;
    Stock stockDisponible = new Stock();
    private int capacidad;
    NivelMembresia nivelMinimoMembresia;
    private String direccion;
    
    public Sede(String nombre, int capacidad, NivelMembresia nivelMinimoMembresia) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.nivelMinimoMembresia = nivelMinimoMembresia;
        this.direccion = direccion;
    }
    public int getCapacidad() {
        return this.capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public void agregarClase(Clase clase){
        this.ListaClases.add(clase);
    }
    public void eliminarClase(Clase clase){
        this.ListaClases.remove(clase);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public NivelMembresia getNivelMinimoMembresia() {
        return nivelMinimoMembresia;
    }

    public String toString(){
        
        return nombre;
    }


    
    
}
    
    