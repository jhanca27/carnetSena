package com.sena.carnetSena.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="roles")
public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idRol;
	
	@Column(name="nombre rol")
	private String nombreRol;
	
	public Rol() {
		// TODO Auto-generated constructor stub
	}

	public Rol(long idRol, String nombreRol) {
		super();
		this.idRol = idRol;
		this.nombreRol = nombreRol;
	}

	public long getIdRol() {
		return idRol;
	}

	public void setIdRol(long idRol) {
		this.idRol = idRol;
	}

	public String getNombreRol() {
		return nombreRol;
	}

	public void setNombreRol(String nombreRol) {
		this.nombreRol = nombreRol;
	}

}
