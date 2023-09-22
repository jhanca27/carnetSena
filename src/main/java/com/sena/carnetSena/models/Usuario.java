package com.sena.carnetSena.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUsuario;
	@Column(name = "nombre usuario")
	private String nombreUsuario;
	@Column(name = "documento usuario")
	private String documentUsuario;
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Rol rol;
/*
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Centro centro;
*/
	@Column(name = "foto usuario")
	private String fotoUsuario;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(long idUsuario, String nombreUsuario, String documentUsuario, Rol rol, /*Centro centro,*/
			String fotoUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.documentUsuario = documentUsuario;
		this.rol = rol;
		/*
		this.centro = centro;
		*/
		this.fotoUsuario = fotoUsuario;
	}

	public long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getDocumentUsuario() {
		return documentUsuario;
	}

	public void setDocumentUsuario(String documentUsuario) {
		this.documentUsuario = documentUsuario;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
/*
	public Centro getCentro() {
		return centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}
*/
	public String getFotoUsuario() {
		return fotoUsuario;
	}

	public void setFotoUsuario(String fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}

}
