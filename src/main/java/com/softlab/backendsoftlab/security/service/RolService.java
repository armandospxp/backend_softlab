package com.softlab.backendsoftlab.security.service;

import com.softlab.backendsoftlab.security.entity.Rol;
import com.softlab.backendsoftlab.security.enums.RolNombre;
import com.softlab.backendsoftlab.security.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getbyRolNombre(RolNombre rolNombre){
        return rolRepository.findbyNombre(rolNombre);
    }



}
