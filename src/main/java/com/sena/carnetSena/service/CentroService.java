package com.sena.carnetSena.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.carnetSena.models.Centro;
import com.sena.carnetSena.repository.CentroRepository;

@Service
public class CentroService {
	
	@Autowired
	private CentroRepository centroRepository;
	
	public void saveCentro(Centro centro) {
		centroRepository.save(centro);
	}
	
	public void updateCentro(Centro centro) {
		centroRepository.save(centro);
	}
	
	public Set<Centro> findAllCentro(){
		return centroRepository.findAll().stream().collect(Collectors.toSet());
	}
	
	public Centro findByIdCentro(Long idCentro) {
		return centroRepository.findById(idCentro).get();
	}
	
	public void deleteCentro(Long idCentro) {
		centroRepository.deleteById(idCentro);
	}
}	
