package com.softlab.backendsoftlab.entity.analisis;

public class Determinaciones {
    private int id_determinacion;
    private String nombre_determinacion;
    private String descripcion_determinacion;
    private int limite_inferior;
    private int limite_superior;
    private String valor_referencia;
    private int id_unidad_medida;
    private int id_metodo;

    public int getIdDeterminacion(){
        return this.id_determinacion;
    }

    public void setIdDeterminacion(int id_determinacion){
        this.id_determinacion = id_determinacion;
    }

    public String getNombreDeterminacion(){
        return this.nombre_determinacion;
    }

    public void setNombreDeterminacion(String nombre_determinacion){
        this.nombre_determinacion = nombre_determinacion;
    }

    public String getDescripcionDeterminacion(){
        return this.descripcion_determinacion;
    }

    public void setDescripcionDeterminacion(String descripcion_determinacion){
        this.descripcion_determinacion = descripcion_determinacion;
    }

    public int getLimiteInferior(){
        return this.limite_inferior;
    }

    public void setLimiteInferior(int limite_inferior){
        this.limite_inferior = limite_inferior;
    }

    public int getLimteSuperior(){
        return this.limite_superior;
    }

    public void setLimiteSuperior(int limite_superior){
        this.limite_superior = limite_superior;
    }

    public int getIdUnidadMedida(){
        return this.id_unidad_medida;
    }

    public void setunidadMedida(int id_unidad_medida){
        this.id_unidad_medida = id_unidad_medida;
    }

    public int getIdMetodo(){
       return this.id_metodo;
    }

    public void setIdMetodo(int id_metodo){
        this.id_metodo = id_metodo;
    }



}
