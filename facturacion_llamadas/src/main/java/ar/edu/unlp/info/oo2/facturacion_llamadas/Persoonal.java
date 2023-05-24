package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//clase dios. El nombre de la clase se confunde con la clase Persona
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
	
	public Llamada registrarLlamada(Persoona q, Persoona q2, String t, int d) {// nombres de parametros poco descriptivos
		Llamada x = new Llamada();
		x.tipoDeLlamada = t;
		x.setEmisor(q.getTelefono());
		x.setRemitente(q2.getTelefono());
		x.dur= d;
		llamadas.add(x);
		q.getLlamadas().add(x);
		return x;
		
	}
	
	public double calcularMontoTotalLlamadas(Persoona p) {// exceso de condicionales. No se aplica polimorfismo
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
				if (l.tipoDeLlamada == "nacional") {
					auxc += l.dur *3 + (l.dur*3*0.21);
				} else if (l.tipoDeLlamada == "internacional") {
					auxc += l.dur *200 + (l.dur*200*0.21);
				}							
				auxc -= auxc*aux.getDescuento();				
				c += auxc;
			}
		}
		return c;//exceso de condicionales Switch Statements. Long method.
	}

	public int cantidadDeUsuarios() {
		return personas.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return personas.contains(persona);
	}
	
}
