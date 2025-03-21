package com.centroinformacion.entity;

import java.sql.Date;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "prestamo_tiene_libro")
public class PrestamoHasLibro {

	
	@EmbeddedId
	private PrestamoHasLibroPK prestamoHasLibroPK;
	private Date fechaDevol;
	private String serie;
	private int anio;

	@ManyToOne
	@JoinColumn(name = "idPrestamo", nullable = false, insertable = false, updatable = false)
	private Prestamo prestamo;
	
	@ManyToOne
	@JoinColumn(name = "idLibro", nullable = false, insertable = false, updatable = false)
	private Libro libro;

	
	
}
