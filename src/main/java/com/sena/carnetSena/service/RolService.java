package com.sena.carnetSena.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.carnetSena.models.Rol;
import com.sena.carnetSena.repository.RolRepository;

@Service
public class RolService {
	
	@Autowired
	private RolRepository rolRepository;
	

	public void saveRol(Rol rol) {
		rolRepository.save(rol);
	}
	
	public void updateRol(Rol rol) {
		rolRepository.save(rol);
	}
	
	public Set<Rol> findAllRol(){
		return rolRepository.findAll().stream().collect(Collectors.toSet());
	}
	
	public Rol findByIdRol(Long idRol) {
		return rolRepository.findById(idRol).get();
	}
	
	public void deleteRol(Long idRol) {
		rolRepository.deleteById(idRol);
	}
}
