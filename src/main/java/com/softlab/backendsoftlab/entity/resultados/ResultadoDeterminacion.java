package com.softlab.backendsoftlab.entity.resultados;

public class ResultadoDeterminacion {
    private int id_resultado_determinacion;
    private int id_resultado;
    private String valor;

    public int getIdResultadoDeterminacion(){
        return this.id_resultado_determinacion;
    }
    public void setIdResultadoDeterminacion(int id_resultado_determinacion){
        this.id_resultado_determinacion = id_resultado_determinacion;
    }
    public int getIdResultado(){
        return this.id_resultado;
    }
    public void setIdResultado(int id_resultado){
        this.id_resultado = id_resultado;
    }

    public String getValor(){
        return this.valor;
    }

    public void setValor(String valor){
        this.valor = valor;
    }
}
