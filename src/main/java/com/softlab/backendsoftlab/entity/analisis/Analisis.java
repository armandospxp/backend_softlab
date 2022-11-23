package com.softlab.backendsoftlab.entity.analisis;

import javax.persistence.*;

/****
 * Modelo Análisis
 *
 *
 */

@Entity
@Table(name="analisis")
public class Analisis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id_analisis;
    private String nombre_analisis;
    private String descripcion_analisis;
    private int  id_tipo_muestra;

    public Analisis() {
    }


    public int getIdAnalisis(){
        return this.id_analisis;
    }

    public void setIdAnalisis(int id_analisis){
        this.id_analisis = id_analisis;
    }

    public String getNombreAnalisis(){
        return this.nombre_analisis;
    }

    public void setNombreAnalisis(String nombre_analisis){
        this.nombre_analisis = nombre_analisis;
    }

    public int getIdTipoMuestra(){
        return this.id_tipo_muestra;
    }

    public void setIdTipoMuestra(int id_tipo_muestra){
        this.id_tipo_muestra = id_tipo_muestra;
    }

    public String getDescripcionAnalisis(){
        return this.descripcion_analisis;
    }

    public void setDescripcionAnalisis(String descripcion_analisis){
        this.descripcion_analisis = descripcion_analisis;
    }


}
