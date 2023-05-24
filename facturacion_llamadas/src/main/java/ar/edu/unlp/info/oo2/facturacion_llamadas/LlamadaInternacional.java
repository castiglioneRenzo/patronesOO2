package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {
	public LlamadaInternacional(String emisor, String remitente, int duracion) {
		super(emisor, remitente, duracion);
	}
	
	public double calcularCosto() {
		return (this.getDur() *200 ) + (this.getDur()*200*0.21);
	
	}
}
