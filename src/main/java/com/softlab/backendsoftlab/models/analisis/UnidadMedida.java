package com.softlab.backendsoftlab.models.analisis;

public class UnidadMedida {
    private int id_unidad_medida;
    private String nombre_unidad;
    private String abreviacion_unidad;

    public int getIdUnidadMedida(){
        return this.id_unidad_medida;
    }

    public void setIdUnidadMedida(int id_unidad_medida){
        this.id_unidad_medida = id_unidad_medida;
    }

    public String getNombreUnidad(){
        return this.nombre_unidad;
    }

    public void setNombreUnidad(String nombre_unidad){
        this.nombre_unidad = nombre_unidad;
    }

    public String getAbreviacionUnidad(){
        return this.abreviacion_unidad;
    }

    public void setAbreviacionUnidad(String abreviacion_unidad){
        this.abreviacion_unidad = abreviacion_unidad;
    }
}
