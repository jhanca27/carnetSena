package com.sena.carnetSena.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.carnetSena.models.Usuario;
import com.sena.carnetSena.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void saveUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public void updateUsuario(Usuario Usuario) {
		usuarioRepository.save(Usuario);
	}
	
	public Set<Usuario> findAllUsuario(){
		return usuarioRepository.findAll().stream().collect(Collectors.toSet());
	}
	
	public Usuario findByIdUsuario(Long idUsuario) {
		return usuarioRepository.findById(idUsuario).get();
	}
	
	public void deleteUsuario(Long idUsuario) {
		usuarioRepository.deleteById(idUsuario);
	}
}
