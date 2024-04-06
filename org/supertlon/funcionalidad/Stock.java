package org.supertlon.funcionalidad;


import java.util.*;
public class Stock{
    protected Map<String, Integer> diccionarioStock = new HashMap<>();
    protected int PesaMano;
    protected int PesaTobillera;
    protected int PesaDisco;
    protected int Colchoneta2;
    protected int Colchoneta1;
    protected int Botas;
    public int getPesaMano() {
        return this.PesaMano;
    }
    public void setPesaMano(int value) {
        this.PesaMano = value;
    }
    public int getPesaTobillera() {
        return this.PesaTobillera;
    }
    public void setPesaTobillera(int value) {
        this.PesaTobillera = value;
    }
    public int getPesaDisco() {
        return this.PesaDisco;
    }
    public void setPesaDisco(int value) {
        this.PesaDisco = value;
    }
    public int getColchoneta2() {
        return this.Colchoneta2;
    }
    public void setColchoneta2(int value) {
        this.Colchoneta2 = value;
    }
    public int getColchoneta1() {
        return this.Colchoneta1;
    }
    public void setColchoneta1(int value) {
        this.Colchoneta1 = value;
    }
    public int getBotas() {
        return this.Botas;
    }
    public void setBotas(int value) {
       this.Botas = value;
    }

}