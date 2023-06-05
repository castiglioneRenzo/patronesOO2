package ar.edu.unlp.info.oo2.ejercicio_14;

import java.time.LocalDate;

public class FileOO2 implements File {
	private String nombre;	
	private String extension;
	private double tamano;
	private LocalDate fechaDeCreacion;
	private LocalDate fechaDeModificacion;
	private String permisos;
	
	public FileOO2() {
		
	}
	
	public FileOO2(String nombre, String extension, double tamano, LocalDate fechaDeCreacion,
			LocalDate fechaDeModificacion, String permisos) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.tamano = tamano;
		this.fechaDeCreacion = fechaDeCreacion;
		this.fechaDeModificacion = fechaDeModificacion;
		this.permisos = permisos;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}
	public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
		this.fechaDeCreacion = fechaDeCreacion;
	}
	public LocalDate getFechaDeModificacion() {
		return fechaDeModificacion;
	}
	public void setFechaDeModificacion(LocalDate fechaDeModificacion) {
		this.fechaDeModificacion = fechaDeModificacion;
	}
	public String getPermisos() {
		return permisos;
	}
	public void setPermisos(String permisos) {
		this.permisos = permisos;
	}
	public double getTamano() {
		return tamano;
	}
	
	public String prettyPrint() {
		return "" ;
	}
}
