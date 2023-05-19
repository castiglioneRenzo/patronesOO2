package ar.edu.unlp.info.oo2.ejercicio_16;

import java.util.List;

public class ProductoCombinado extends ProductoFinanciero{
	
	private List<ProductoFinanciero> productos;
	
	public ProductoCombinado(List<ProductoFinanciero> partes) {
		this.productos = partes;
	}
	
	public double ganancia(double montoInicial) {
		var gananciaAux = new Object(){double value = montoInicial;};		
		productos.stream().forEachOrdered(producto -> {gananciaAux.value += producto.ganancia(gananciaAux.value);});
		return gananciaAux.value;
	}

	public List<ProductoFinanciero> getProductos() {
		return productos;
	}
}
