package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Archivo implements IArchivo{
	/**
	* Crea un nuevo archivo con nombre <nombre>, de <tamano> tamano 
	* y en la fecha <fecha>.
	    */
	private String nombre;
	private LocalDate fechaDeCreacion;
	private int tamano;
	
	public Archivo(String nombre, LocalDate fecha, int tamano) {
		this.fechaDeCreacion = fecha;
		this.nombre = nombre;
		this.tamano = tamano;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public LocalDate getFechaDeCreacion() {
		return this.fechaDeCreacion;
	}
	public int tamanoTotalOcupado() {
		return this.tamano;
	}
	public List<IArchivo> getArchivos() {
		List<IArchivo> aux = new ArrayList<>();
		aux.add(this);
		return aux;
	}
}
