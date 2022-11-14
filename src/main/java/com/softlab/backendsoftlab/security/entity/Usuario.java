package com.softlab.backendsoftlab.security.entity;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;


import java.util.HashSet;
import java.util.Set;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
    @NotNull
    private String nombre_usuario;
    @NotNull
    private String nombre_apellido;
    @NotNull
    @Column(unique = true)
    private String email;
    @NotNull
    private String password;
    @ManyToMany
    @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "id_usuario"),
    inverseJoinColumns = @JoinColumn(name = "id_rol"))
    private Set<Rol> roles = new HashSet<Rol>();

    public Usuario(){

    }

    public Usuario(@NotNull String nombre_usuario, @NotNull String nombre_apellido, @NotNull String email, @NotNull String password) {
        this.nombre_usuario = nombre_usuario;
        this.nombre_apellido = nombre_apellido;
        this.email = email;
        this.password = password;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }
}
