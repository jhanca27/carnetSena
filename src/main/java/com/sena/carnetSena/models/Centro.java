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
@Table(name = "centros")
public class Centro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCentro;
	
	@Column(name = "nombre centro")
	private String nombreCentro;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Regional regional;
	
	public Centro() {
		// TODO Auto-generated constructor stub
	}

	public Centro(Long idCentro, String nombreCentro, Regional regional) {
		super();
		this.idCentro = idCentro;
		this.nombreCentro = nombreCentro;
		this.regional = regional;
	}

	public Long getIdCentro() {
		return idCentro;
	}

	public void setIdCentro(Long idCentro) {
		this.idCentro = idCentro;
	}

	public String getNombreCentro() {
		return nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}

	public Regional getRegional() {
		return regional;
	}

	public void setRegional(Regional regional) {
		this.regional = regional;
	}
	
}
