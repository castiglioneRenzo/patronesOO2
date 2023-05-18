package ar.edu.unlp.info.oo2.ejercicio_16;

public class CompraDolares extends ProductoFinanciero{
	
	private double valorCompra;
	
	public CompraDolares(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
	public double ganancia(double montoInicial) {
		return 0;
	}

	public double getValorCompra() {
		return valorCompra;
	}
}
