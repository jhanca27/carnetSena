package com.sena.carnetSena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.carnetSena.models.Rol;

@Repository
public interface repositoryRol extends JpaRepository<Rol, Long>{

}
