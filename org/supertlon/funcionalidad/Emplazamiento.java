package org.supertlon.funcionalidad;

import java.util.*;

public class Emplazamiento {
    private Sede sede;
    private int capacidad;
    private int alquiler;
    private String nombre;
    private int mts2;
    Emplazamiento(String nombre, int alquiler, int mts2, Sede sede) {
        this.nombre = nombre;
        this.alquiler = alquiler;
        this.mts2 = mts2;
        this.sede = sede;
    }
    public int getMts2() {
        return this.mts2;
    }

    public void setMts2(int mts2) {
        this.mts2 = mts2;
    }

    public Sede getSede() {
        return this.sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getAlquiler() {
        return this.alquiler;
    }

    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }
}
