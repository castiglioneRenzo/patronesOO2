package ar.edu.unlp.info.oo2.ejercicio_16;

public class CompraPesos extends ProductoFinanciero{
	
	private double valorCompra;
	
	public CompraPesos(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	public double ganancia(double montoInicial) {
		return 0;
	}

	public double getValorCompra() {
		return valorCompra;
	}
}
