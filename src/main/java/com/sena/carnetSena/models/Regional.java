package com.sena.carnetSena.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "regionales")

public class Regional {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRegional;
	
	@Column(name = "nombre Regional")
	private String nombreRegional;
	
	
	public Regional() {
		// TODO Auto-generated constructor stub
	}


	public Regional(Long idRegional, String nombreRegional) {
		super();
		this.idRegional = idRegional;
		this.nombreRegional = nombreRegional;
	}


	public Long getIdRegional() {
		return idRegional;
	}


	public void setIdRegional(Long idRegional) {
		this.idRegional = idRegional;
	}


	public String getNombreRegional() {
		return nombreRegional;
	}


	public void setNombreRegional(String nombreRegional) {
		this.nombreRegional = nombreRegional;
	}
	
	
	
}
