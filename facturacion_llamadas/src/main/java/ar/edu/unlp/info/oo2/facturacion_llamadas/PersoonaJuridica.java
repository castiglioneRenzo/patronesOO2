package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersoonaJuridica extends Persoona {
	public String cuit;
	static double descuento = 0.15;	

	public PersoonaJuridica(String data, String nombre, String telefono) {
		this.cuit = data;
		this.setNombreYApellido(nombre);
		this.setTelefono(telefono);
	}
	
	public String getCuit() {
		return cuit;
	}
	
	public double getDescuento() {
		return descuento;
	}
}
