package ar.edu.unlp.info.oo2.ejercicio_16;

import java.util.List;

public class ProductoCombinado extends ProductoFinanciero{
	
	private List<ProductoFinanciero> productos;
	
	public ProductoCombinado(List<ProductoFinanciero> partes) {
		this.productos = partes;
	}
	
	public double ganancia(double montoInicial) {
		return 0;
	}

	public List<ProductoFinanciero> getProductos() {
		return productos;
	}
}
