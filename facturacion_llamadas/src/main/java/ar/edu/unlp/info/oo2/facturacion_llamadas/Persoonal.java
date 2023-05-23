package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//clase dios. El nombre de la clase se confunde con la clase Persona
public class Persoonal {//nombres de variables no descriptivos
	List<Persoona> personas = new ArrayList<Persoona>();//--v
	List<Llamada> llamadas = new ArrayList<Llamada>();//--v
	GuiaTelefonica guiaTelefonica = new GuiaTelefonica();// Nombre no descriptivo
	static double descuentoJur = 0.15;
	static double descuentoFis = 0;
	
	public boolean agregarTelefono(String numero) {
		return guiaTelefonica.agregarTelefono(numero);
	}
	
	public Persoona registrarUsuario(String data, String nombre, String t) {
		Persoona var = new Persoona();
		if (t.equals("fisica")) {	//Deberian ser subclases de llamada. Replace Type Code with Subclasses
			var.setNya(nombre);
			String tel = guiaTelefonica.getLast();
			guiaTelefonica.eliminar(tel);
			var.setT(t);
			var.setTel(tel);
			var.setDoc(data);
		}
		else if (t.equals("juridica")) {
			String tel = guiaTelefonica.getLast();
			guiaTelefonica.eliminar(tel);
			var.nya =nombre;
			var.t =t;
			var.tel = tel;
			var.cuit =data;
		}
		var.sis = this;
		personas.add(var);
		return var;
		
	}
	
	public boolean eliminarUsuario(Persoona p) {
		List<Persoona> l = p.sis.personas.stream().filter(persona -> persona != p).collect(Collectors.toList());
		boolean borre = false;
		if (l.size() < personas.size()) {
			this.personas = l;
			this.guiaTelefonica.agregarTelefono(p.getTel());
			borre = true;
		}
		return borre;
		
	}
	
	public Llamada registrarLlamada(Persoona q, Persoona q2, String t, int d) {// nombres de parametros poco descriptivos
		Llamada x = new Llamada();
		x.tipoDeLlamada = t;
		x.setEmisor(q.tel);
		x.setRemitente(q2.getTel());
		x.dur= d;
		llamadas.add(x);
		q.lista1.add(x);
		return x;
		
	}
	
	public double calcularMontoTotalLlamadas(Persoona p) {//feature envy. deberia estar en llamada (ref. extract method)
		double c = 0;
		Persoona aux = null;
		for (Persoona pp : personas) {
			if (pp.tel == p.getTel()) {
				aux = pp;
				break;
			}
		} if (aux == null) return c;
		if (aux != null) {
			for (Llamada l : aux.lista1) {
				double auxc = 0;
				if (l.tipoDeLlamada == "nacional") {
					auxc += l.dur *3 + (l.dur*3*0.21);
				} else if (l.tipoDeLlamada == "internacional") {
					auxc += l.dur *200 + (l.dur*200*0.21);
				}
				
				if (aux.t == "fisica") {
					auxc -= auxc*descuentoFis;
				} else if(aux.t == "juridica") {
					auxc -= auxc*descuentoJur;
				}
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
