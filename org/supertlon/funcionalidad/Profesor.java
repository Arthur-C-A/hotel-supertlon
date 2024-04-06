package org.supertlon.funcionalidad;


import java.util.*;
public class Profesor {
    private int cantClases;
    private List<Clase> enQueClases = new ArrayList<>();
    private String nombre;
    private int sueldo;
    public Profesor(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public String getNombre() {
        return this.nombre;
    }
    public int getCantClases() {
        return this.cantClases;
    }
    public void aumentarCantClases() {
        this.cantClases+=1;
    }
    public void disminuirCantClases() {
        this.cantClases-=1;
    }
    public List<Clase> enQueClasesEsta() {
        return this.enQueClases;
    }
    public void agregarClase(Clase clase){
        this.enQueClases.add(clase);
    }
    public void quitarClase(Clase clase){
        this.enQueClases.remove(clase);
    }
    public int getSueldo(){
        return this.sueldo;
    }
    
    @Override
public String toString() {
    return "Profesor: " + this.nombre;
}
}