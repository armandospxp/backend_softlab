package com.softlab.backendsoftlab.security.repository;

import com.softlab.backendsoftlab.security.entity.Rol;
import com.softlab.backendsoftlab.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findbyNombre(RolNombre rolNombre);
}
