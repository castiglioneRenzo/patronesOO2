package ar.edu.unlp.info.oo2.ejercicio_16;

import java.util.List;
import java.util.ArrayList;

public class ProductoCombinadoBuilder implements Builder {
	private ProductoCombinado productoCombinado;
	private List<ProductoFinanciero> productos;
	
	public ProductoCombinadoBuilder() {
		reset();
	}
	
	private void nuevoProductoCombinado() {
		this.productoCombinado = new ProductoCombinado(this.productos);
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
	
	public void reset() {
		this.productoCombinado = null;
		this.productos = new ArrayList<ProductoFinanciero>();
	}
	
	// getResult()
	public ProductoCombinado getResult() {
		nuevoProductoCombinado();		
		return this.productoCombinado;
	}
}
