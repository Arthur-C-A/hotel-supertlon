package org.supertlon.funcionalidad;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Articulo {
    protected int clasesDeUso;
    protected int clasesUsabilidad;
    protected int precioUso;
    private String nombre;
    private String amortizacion;
    private List<Articulos> articulos = new ArrayList<>();
    Articulo(String nombre, int clasesUsabilidad) {
        this.nombre = nombre;
        this.clasesUsabilidad = clasesUsabilidad;
        this.precioUso = precioUso;
        this.amortizacion = "Por Clase";
    }

    public int getClasesDeUso() {
        return this.clasesDeUso;
    }
    
    public String calcularDeAmort(String nombre,String amortizacion,int horasUsoAcum, int horasUso, LocalDate fechaFabricacion ){
        long aux1 = 0;
        long aux = 0;
        if ("Colchoneta Alta Densidad".equals(nombre)){
            horasUsoAcum = horasUsoAcum + horasUso;
            aux1 = (20*60)*horasUsoAcum;
            return amortizacion=(aux1/100 + "%");}
        
        if ("Pesa tobillera".equals(nombre)){
            horasUsoAcum = horasUsoAcum + horasUso;
            aux1 = (20*60)*horasUsoAcum;
            return amortizacion=(aux1/100 + "%");
        
        }
        
        if ("Colchoneta Liviana".equals(nombre)){
            aux = (int) ChronoUnit.DAYS.between(LocalDate.now(), fechaFabricacion);
            aux = 400 - aux;
                return amortizacion = ("Restan"+ aux + "de uso");
        }
         if ("Pesa Tobillera Ironman".equals(nombre)){
            aux = ChronoUnit.DAYS.between(LocalDate.now(), fechaFabricacion);
            aux = 200 - aux;
            if(aux>=0){
                return amortizacion = ("Restan"+ aux + "de uso");
        
            }
            else{
                return amortizacion = ("No quedan dias de uso");
         
            }  
        }      
        return null;
     }

    public void setClasesDeUso(int clasesDeUso) {
        this.clasesDeUso = clasesDeUso;
    }

    public int getPrecioUso() {
        return this.precioUso;
    }

    public void setPrecioUso(int precioUso) {
        this.precioUso = precioUso;
    }

    public int getClasesUsabilidad() {
        return this.clasesUsabilidad;
    }

    public void setClasesUsabilidad(int clasesUsabilidad) {
        this.clasesUsabilidad = clasesUsabilidad;
    }

    public List<Articulos> getArticulos() {
        return this.articulos;
    }

    private static class Articulos {

        public Articulos() {
        }
    }

    public enum estadoArticulo {
        enUso,
        deBaja
    }
    public String getNombre() {
        return this.nombre;
    }

}