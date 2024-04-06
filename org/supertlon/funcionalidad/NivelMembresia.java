package org.supertlon.funcionalidad;



import java.util.*;
public class NivelMembresia {
    private String nombreNivelMembresia;
    private int prestigio;
    private int costoMembresia;
    private String nombre;

    NivelMembresia(String nombre, int prestigio, int costoMembresia) {
        this.nombre = nombre;
        this.prestigio = prestigio;
        this.costoMembresia = costoMembresia;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPrestigio(){
        return this.prestigio;
    }
    public int getCostoMembresia() {
        return this.costoMembresia;
    }
    public void setCostoMembresia(int costoMembresia) {
        this.costoMembresia = costoMembresia;
    }
    @Override
    public String toString() {
        return nombre;
}
}