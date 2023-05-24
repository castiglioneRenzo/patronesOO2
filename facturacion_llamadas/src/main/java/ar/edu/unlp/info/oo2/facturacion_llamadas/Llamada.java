package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private String emisor;
	private String remitente;
	private int dur;
	
	public Llamada(String emisor, String remitente, int duracion) {
		this.setEmisor(emisor);
		this.setRemitente(remitente);
		this.setDur(duracion);		
	}
	public static Llamada nuevo(String tipoDeLlamada, String emisor, String remitente, int duracion) {
		switch (tipoDeLlamada) {
		case "nacional":
			return new LlamadaNacional(emisor, remitente, duracion);
		case "internacional":
			return new LlamadaInternacional(emisor, remitente, duracion);
		default: 
			return null;
		} 
	}

	public String getEmisor() {
		return this.emisor;
	}
	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public abstract double calcularCosto();
	
	public int getDur() {
		return dur;
	}
	public void setDur(int dur) {
		this.dur = dur;
	}
	
	
	
	
}
