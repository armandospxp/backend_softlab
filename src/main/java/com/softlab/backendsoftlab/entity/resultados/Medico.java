package com.softlab.backendsoftlab.entity.resultados;

public class Medico {
    private int id_medico;
    private String nombre_medico;
    private String apellido_medico;
    private String numero_registro;

    public int getidMedico(){
        return this.id_medico;
    }
    public void setIdMedico(int id_medico){
        this.id_medico = id_medico;
    }
    public String getNombreMedico(){
        return this.nombre_medico;
    }
    public void setNombreMedico(String nombre_medico){
        this.nombre_medico = nombre_medico;
    }
    public String getApellidoMedico(){
        return this.apellido_medico;
    }
    public void setApellidoMedico(String apellido_medico){
        this.apellido_medico = apellido_medico;
    }
    public String getNumeroRegistro(){
        return this.numero_registro;
    }
    public void setNumeroRegistro(String numero_registro){
        this.numero_registro = numero_registro;
    }
}
