package com.sena.carnetSena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.carnetSena.models.Usuario;

@Repository
public interface repositoryUsuario extends JpaRepository<Usuario, Long>{

}
