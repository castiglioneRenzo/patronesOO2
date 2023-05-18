package ar.edu.unlp.info.oo2.ejercicio_16;

public class PlazoFijoRenovable extends ProductoFinanciero{
	
	private int cantidadDias;
	private double interes;
	
	public PlazoFijoRenovable(int cantidadDias, double interes) {
		this.cantidadDias = cantidadDias;
		this.interes = interes;
	}
	
	public double ganancia(double montoInicial) {
		return 0;
	}

	public int getCantidadDias() {
		return cantidadDias;
	}

	public double getInteres() {
		return interes;
	}
}
