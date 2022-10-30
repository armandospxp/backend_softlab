package com.softlab.backendsoftlab.models.resultados;

public class Resultado {
    private int id_resultado;
    private int id_pedido_analisis;
    private String estado;

    public int getIdResultado(){
        return this.id_resultado;
    }

    public void setIdResultado(int id_resultado){
        this.id_resultado = id_resultado;
    }
    public int getIdPedidoAnalisis(){
        return this.id_pedido_analisis;
    }
    public void setIdPedidoAnalisis(int id_pedido_analisis){
        this.id_pedido_analisis = id_pedido_analisis;
    }

    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

}
