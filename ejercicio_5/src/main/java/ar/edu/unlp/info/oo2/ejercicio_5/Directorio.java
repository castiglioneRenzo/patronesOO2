package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directorio implements IArchivo{
	private String nombre;
	private LocalDate fechaDeCreacion;
	private static int tamano = 32;
	private List<IArchivo> contenido;
	/**
	* Crea un nuevo Directorio con nombre <nombre> y en la fecha <fecha>.
	*/
	public Directorio(String nombre, LocalDate fecha) {
		this.fechaDeCreacion = fecha;
		this.nombre = nombre;
		this.contenido = new ArrayList<IArchivo>();
	}

	   	 /**
	* Retorna el espacio total ocupado, incluyendo su contenido.
	*/
	public int tamanoTotalOcupado() {
		int tamano = contenido.stream().mapToInt(archivo -> archivo.tamanoTotalOcupado()).sum();		
		return (tamano + this.tamano);
	}

	    	/**
	* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
	* filesystem contenido por directorio receptor
	*/
	public IArchivo archivoMasGrande() {
		List<IArchivo> aux = new ArrayList<IArchivo>();
		for(IArchivo archivo: this.contenido) {
			archivo.getArchivos().stream().forEach(arch-> aux.add(arch));
		}
		return aux.stream().max((a1,a2) -> Double.compare(a1.tamanoTotalOcupado(), a2.tamanoTotalOcupado())).orElse(null);		
	}
	/**
	* Retorna el archivo con fecha de creación más reciente en cualquier nivel 
	* del filesystem contenido por directorio receptor.
	*/
	public IArchivo archivoMasNuevo() {
		List<IArchivo> aux = new ArrayList<IArchivo>();
		for(IArchivo archivo: this.contenido) {
			archivo.getArchivos().stream().forEach(arch-> aux.add(arch));
		}
		return aux.stream().max((a1,a2) -> a1.getFechaDeCreacion().compareTo(a2.getFechaDeCreacion())).orElse(null);
	}
	
	public List<IArchivo> getArchivos() {
		List<IArchivo> aux = new ArrayList<IArchivo>();
		contenido.stream().forEach(archivo -> archivo.getArchivos().stream().forEach(a -> aux.add(a)));
		return aux;
		//return contenido.stream().filter(archivo -> (archivo.getClass().equals(Archivo.class))).collect(Collectors.toList());
	}
	public void agregar(IArchivo archivo) {
		contenido.add(archivo);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public LocalDate getFechaDeCreacion() {
		return this.fechaDeCreacion;		
	}

}
