package com.sena.carnetSena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.carnetSena.models.Centro;

@Repository
public interface repositoryCentro extends JpaRepository<Centro, Long>{

}
