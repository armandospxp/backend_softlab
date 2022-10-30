package com.softlab.backendsoftlab.models.resultados;

public class Paciente {
    private int id_paciente;
    private String documento_paciente;
    private String nombre_paciente;
    private String apellido_paciente;
    private String direccion_paciente;
    private String telefono_paciente;
    private String correo_paciente;

    public int getIdPaciente(){
        return this.id_paciente;
    }
    public void setIdPaciente(int id_paciente){
        this.id_paciente = id_paciente;
    }
    public String getNombrePaciente(){
        return this.nombre_paciente;
    }
    public void setNombrePaciente(String nombre_paciente){
        this.nombre_paciente = nombre_paciente;
    }
    public String getApellidoPaciente(){
        return this.apellido_paciente;
    }
    public void setApellidoPaciente(String apellido_paciente){
        this.apellido_paciente = apellido_paciente;
    }
    public String getDireccionPaciente(){
        return this.direccion_paciente;
    }
    public void setDireccionPaciente(String direccion_paciente){
        this.direccion_paciente = direccion_paciente;
    }
    public String getTelefonoPaciente(){
        return this.telefono_paciente;
    }
    public void setTelefonoPaciente(String telefono_paciente){
        this.telefono_paciente = telefono_paciente;
    }
    public String getCorreoPaciente(){
        return this.correo_paciente;
    }
    public void setCorreoPaciente(String correo_paciente){
        this.correo_paciente = correo_paciente;
    }
}
