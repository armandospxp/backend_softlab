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
    private String nombreUsuario;
    @NotNull
    private String nombreApellido;
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

    public Usuario(@NotNull String nombreUsuario, @NotNull String nombreApellido, @NotNull String email, @NotNull String password) {
        this.nombreUsuario = nombreUsuario;
        this.nombreApellido = nombreApellido;
        this.email = email;
        this.password = password;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getnombreUsuario() {
        return nombreUsuario;
    }

    public void setnombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getnombreApellido() {
        return nombreApellido;
    }

    public void setnombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
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
