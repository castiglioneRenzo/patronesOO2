package ar.edu.unlp.info.oo2.ejercicio_16;

import java.util.List;

public class ProductoCombinadoBuilder implements Builder {
	private ProductoCombinado productoCombinado;
	private List<ProductoFinanciero> productos;
	
	public void nuevoProductoCombinado() {
		
	}
	
	/** steps */
	public void nuevaCompraDolares(double valorCompra) {
		productos.add(new CompraDolares(valorCompra));
	}
	
	public void nuevaCompraPesos(double valorCompra) {
		productos.add(new CompraPesos(valorCompra));
	}
	
	public void nuevoPlazoFijo(int cantDias, double interes) {
		productos.add(new PlazoFijo(cantDias, interes));
	}
	
	public void nuevoPlazoFijoRenovable(int cantDias, double interes) {
		productos.add(new PlazoFijoRenovable(cantDias, interes));	
	}
	/** end steps */
	
	// getResult()
	public ProductoCombinado getResult() {
		return this.productoCombinado;
	}
}
