package ar.edu.unlp.info.oo2.ejercicio_16;

import java.util.List;

public class ProductoCombinadoBuilder implements Builder {
	private ProductoCombinado productoCombinado;
	private List<ProductoFinanciero> productos;
	
	public void nuevoProductoCombinado() {
		
	}
	
	/** steps */
	public void nuevaCompraDolares() {
		//productos.add(p);
	}
	
	public void nuevaCompraPesos() {
		//productos.add(p);
	}
	
	public void nuevoPlazoFijo() {
		//productos.add(p);
	}
	
	public void nuevoPlazoFijoRenovable() {
		//productos.add(p);	
	}
	/** end steps */
	
	// getResult()
	public ProductoCombinado getResult() {
		return this.productoCombinado;
	}
}
