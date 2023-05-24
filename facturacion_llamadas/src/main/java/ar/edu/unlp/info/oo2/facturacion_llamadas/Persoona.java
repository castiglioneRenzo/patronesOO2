package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Persoona {
	private List<Llamada> llamadas = new ArrayList<Llamada>();
	private String nombreYApellido;
	private String telefono;	
	private Persoonal sistema;//acoplamiento con clase Persoonal (Sistema)
	
	public static Persoona nuevo(String data, String nombre, String tipo, String telefono) {
		switch (tipo) {
		case "fisica":
			return new PersoonaFisica(data, nombre, telefono);
		case "juridica":
			return new PersoonaJuridica(data, nombre, telefono);
		default: 
			return null;
		}
	}
	
	public List<Llamada> getLlamadas() {
		return llamadas;
	}
	public void setLlamadas(List<Llamada> lista1) {
		this.llamadas = lista1;
	}
	public String getNombreYApellido() {
		return nombreYApellido;
	}
	public void setNombreYApellido(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Persoonal getSistema() {
		return sistema;
	}
	public void setSistema(Persoonal sistema) {
		this.sistema = sistema;
	}
	public abstract double getDescuento();
}
