package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GuiaTelefonica {
	private SortedSet<String> guia = new TreeSet<String>();
	
	public SortedSet<String> getGuia() {
		return guia;
	}

	public boolean agregarTelefono(String str) {
		boolean encontre = this.guia.contains(str);
		if (!encontre) {
			this.guia.add(str);
			encontre= true;
			return encontre;
		}
		else {
			encontre= false;
			return encontre;
		}
	}
	
	public String getLast() {
		return this.guia.last();
	}
	
	public boolean eliminar(String telefono) {
		return this.guia.remove(telefono);
	}
}
