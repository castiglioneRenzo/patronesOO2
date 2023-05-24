package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada {
	
	public LlamadaNacional(String emisor, String remitente, int duracion) {
		super(emisor, remitente, duracion);
	}
	
	public double calcularCosto() {
		return (this.getDur() *3) + (this.getDur()*3*0.21);	
	}
}
