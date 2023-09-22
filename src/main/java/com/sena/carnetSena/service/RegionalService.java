package com.sena.carnetSena.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.carnetSena.models.Regional;
import com.sena.carnetSena.repository.RegionalRepository;


@Service
public class RegionalService {

	@Autowired
	private RegionalRepository regionalRepository;
	
	public void saveRegional(Regional regional) {
		regionalRepository.save(regional);
	}
	
	public void updateRegional(Regional regional) {
		regionalRepository.save(regional);
	}
	
	public Set<Regional> findAllRegional(){
		return regionalRepository.findAll().stream().collect(Collectors.toSet());
	}
	
	public Regional findByIdRegional(Long idRegional) {
		return regionalRepository.findById(idRegional).get();
	}
	
	public void deleteRegional(Long idRegional) {
		regionalRepository.deleteById(idRegional);
	}
}
