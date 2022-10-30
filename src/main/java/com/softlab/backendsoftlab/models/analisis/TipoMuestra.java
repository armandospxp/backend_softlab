package com.softlab.backendsoftlab.models.analisis;

public class TipoMuestra {
    private int id_tipo_muestra;
    private String nombre_tipo_muestra;
    private String descripcion_tipo_muestra;

    public int getIdTipoMuestra(){
        return this.id_tipo_muestra;
    }

    public void setIdTipoMuestra(int id_tipo_muestra){
        this.id_tipo_muestra = id_tipo_muestra;
    }

    public String getNombreTipoMuestra(){
        return this.nombre_tipo_muestra;
    }

    public void setNombreTipoMuestra(String nombre_tipo_muestra){
        this.nombre_tipo_muestra = nombre_tipo_muestra;
    }

    public String getDescripcionTipoMuestra(){
        return this.descripcion_tipo_muestra;
    }

    public void setDescripcionTipoMuestra(String descripcion_tipo_muestra){
        this.descripcion_tipo_muestra = descripcion_tipo_muestra;
    }
}
