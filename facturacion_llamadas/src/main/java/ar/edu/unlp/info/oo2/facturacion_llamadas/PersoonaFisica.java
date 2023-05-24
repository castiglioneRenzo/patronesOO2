package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersoonaFisica extends Persoona {	
	public String documento;
	static double descuento = 0;
	
	public PersoonaFisica(String data, String nombre, String telefono) {
		this.documento = data;
		this.setNombreYApellido(nombre);
		this.setTelefono(telefono);		
	}
	
	public String getDocumento() {
		return documento;
	}
	
	public double getDescuento() {
		return descuento;
	}
}
