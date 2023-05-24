package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Persoonal {
	List<Persoona> personas = new ArrayList<Persoona>();
	List<Llamada> llamadas = new ArrayList<Llamada>();
	GuiaTelefonica guiaTelefonica = new GuiaTelefonica();
	public boolean agregarTelefono(String numero) {
		return guiaTelefonica.agregarTelefono(numero);
	}
	
	public Persoona registrarUsuario(String data, String nombre, String t) {
		String tel = guiaTelefonica.getLast();
		Persoona persona= Persoona.nuevo(data, nombre, t, tel);
		guiaTelefonica.eliminar(tel);
		persona.setSistema(this);
		personas.add(persona);
		return persona;		
	}
	
	public boolean eliminarUsuario(Persoona p) {
		List<Persoona> l = p.getSistema().personas.stream().filter(persona -> persona != p).collect(Collectors.toList());
		boolean borre = false;
		if (l.size() < personas.size()) {
			this.personas = l;
			this.guiaTelefonica.agregarTelefono(p.getTelefono());
			borre = true;
		}
		return borre;
		
	}
	
	public Llamada registrarLlamada(Persoona emisor, Persoona remitente, String tipo, int duracion) {
		Llamada llamada = Llamada.nuevo(tipo, emisor.getTelefono(), remitente.getTelefono(), duracion);		
		llamadas.add(llamada);
		emisor.getLlamadas().add(llamada);
		return llamada;
		
	}
	
	public double calcularMontoTotalLlamadas(Persoona p) {
		double c = 0;
		Persoona aux = null;
		for (Persoona pp : personas) {
			if (pp.getTelefono() == p.getTelefono()) {
				aux = pp;
				break;
			}
		} if (aux == null) return c;
		if (aux != null) {
			for (Llamada l : aux.getLlamadas()) {
				double auxc = 0;				
				auxc += l.calcularCosto();										
				auxc -= auxc*aux.getDescuento();				
				c += auxc;
			}
		}
		return c;
	}

	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return personas.contains(persona);
	}
	
}
