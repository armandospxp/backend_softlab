package com.softlab.backendsoftlab.models.analisis;

public class AnalisisDeterminaciones {
    int id_analisis_determinacion;
    int id_analisis;
    int id_determinacion;

    private int getIdAnalisisDeterminacion(){
        return this.id_analisis_determinacion;
    }

    private void setIdAnalisisDeterminacion(int id_analisis_determinacion){
        this.id_analisis_determinacion = id_analisis_determinacion;
    }
    private int getIdAnalisis(){
        return this.id_analisis;
    }
    private void setIdAnalisis(int id_analisis){
        this.id_analisis = id_analisis;
    }
    private int getIdDeterminacion(){
        return this.id_determinacion;
    }
    private void setIdDeterminacion(int id_determinacion){
        this.id_determinacion = id_determinacion;
    }
}
