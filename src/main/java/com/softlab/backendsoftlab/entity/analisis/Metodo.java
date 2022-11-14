package com.softlab.backendsoftlab.entity.analisis;

public class Metodo {
    private int id_metodo;
    private String nombre_metodo;

    public int getIdMetodo(){
        return this.id_metodo;
    }

    public void setIdMetodo(int id_metodo){
        this.id_metodo = id_metodo;
    }
    public String getNombreMetodo(){
        return this.nombre_metodo;
    }

    public void setNombreMetodo(String nombre_metodo){
        this.nombre_metodo = nombre_metodo;
    }
}
