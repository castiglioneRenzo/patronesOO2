package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//clase dios. El nombre de la clase se confunde con la clase Persona
public class Persoonal {//nombres de variables no descriptivos
	List<Persoona> lista1 = new ArrayList<Persoona>();//--v
	List<Llamada> lista2 = new ArrayList<Llamada>();//--v
	GuiaTelefonica lista3 = new GuiaTelefonica();//acoplamiento
	static double descuentoJur = 0.15;
	static double descuentoFis = 0;
	
	public boolean agregarTelefono(String str) {//feature envy. deberia estar en guia telefonica ( ref. extract method)
		boolean encontre = lista3.guia.contains(str);
		if (!encontre) {
			lista3.guia.add(str);
			encontre= true;
			return encontre;
		}
		else {
			encontre= false;
			return encontre;//encontre, no se si es un bloat, pero alarga y entorpece el metodo
		}
	}
	
	public Persoona registrarUsuario(String data, String nombre, String t) {
		Persoona var = new Persoona();
		if (t.equals("fisica")) {
			var.setNya(nombre);
			String tel = lista3.guia.last();
			lista3.guia.remove(tel);
			var.setT(t);
			var.setTel(tel);
			var.setDoc(data);
		}
		else if (t.equals("juridica")) {
			String tel = lista3.guia.last();
			lista3.guia.remove(tel);
			var.nya =nombre;
			var.t =t;
			var.tel = tel;
			var.cuit =data;
		}
		var.sis = this;
		lista1.add(var);
		return var;
		
	}
	
	public boolean eliminarUsuario(Persoona p) {
		List<Persoona> l = p.sis.lista1.stream().filter(persona -> persona != p).collect(Collectors.toList());
		boolean borre = false;
		if (l.size() < lista1.size()) {
			this.lista1 = l;
			this.lista3.guia.add(p.getTel());
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
		lista2.add(x);
		q.lista1.add(x);
		return x;
		
	}
	
	public double calcularMontoTotalLlamadas(Persoona p) {//feature envy. deberia estar en llamada (ref. extract method)
		double c = 0;
		Persoona aux = null;
		for (Persoona pp : lista1) {
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
		return lista1.size();
	}

	public boolean existeUsuario(Persoona persona) {
		return lista1.contains(persona);
	}
	
}
