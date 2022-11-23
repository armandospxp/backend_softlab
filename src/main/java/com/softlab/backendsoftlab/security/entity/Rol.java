package com.softlab.backendsoftlab.security.entity;

import com.softlab.backendsoftlab.security.enums.RolNombre;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

@Entity
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_rol;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre nombre_rol;

    public Rol() {
    }

    public Rol(@NotNull RolNombre nombre_rol) {
        this.nombre_rol = nombre_rol;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public RolNombre getNombre_rol() {
        return nombre_rol;
    }

    public void setNombre_rol(RolNombre nombre_rol) {
        this.nombre_rol = nombre_rol;
    }
}
