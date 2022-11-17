package com.softlab.backendsoftlab.security.service;

import com.softlab.backendsoftlab.security.entity.Usuario;
import com.softlab.backendsoftlab.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getbyNombreUsuario(String nombreUsuario){
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existByNombreUsuario(String nombreUsuario){
        return usuarioRepository.existbyNombreUsuario(nombreUsuario);
    }

    public boolean existByEmail(String email){
        return usuarioRepository.existbyEmail(email);
    }

    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
