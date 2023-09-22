package com.sena.carnetSena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sena.carnetSena.models.Regional;

@Repository
public interface RegionalRepository extends JpaRepository<Regional, Long>{

}

