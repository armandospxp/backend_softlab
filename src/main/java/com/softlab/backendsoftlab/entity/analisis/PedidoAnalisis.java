package com.softlab.backendsoftlab.entity.analisis;

import java.util.Date;

/**
 * Modelo PedidoAnalisis
 *
 */

public class PedidoAnalisis {
    private int id_pedido_analisis;
    private Date fecha;
    private String estado;
    private int numero;
    private int id_paciente;
    private int id_medico;

    public int getIdPedidoAnalisis(){
        return this.id_pedido_analisis;
    }

    public void setIdPedidoAnalisis(int id_pedido_analisis){
        this.id_pedido_analisis = id_pedido_analisis;
    }

    public Date getFecha(){
        return this.fecha;
    }

    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public String getEstado(){
        return this.estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getidPaciente(){
        return this.id_paciente;
    }

    public void setIdPaciente(int id_paciente){
        this.id_paciente = id_paciente;
    }

    public int getIdMedico(){
        return this.id_medico;
    }

    public void setIdMedico(int id_medico){
        this.id_medico = id_medico;
    }
}
