package ar.edu.unlp.info.oo2.ejercicio4;

import java.util.List;

public class Mixta extends Topografia{
	private List<Topografia> partes;
	
	public Mixta(List<Topografia> topografias) {
		this.partes = topografias;		
	}
	
	public double proporcionDeAgua() {
		//calcular la proporcion de agua entre todos sus componentes
		double suma = 0;
		/*
		 * for(Topografia t: partes) { suma += t.proporcionDeAgua(); }
		 */
		for(int i=0; i<4; i++) {
			suma += partes.get(i).proporcionDeAgua();
		}
		suma = suma / 4;
		return suma;
	}
	
	public double proporcionDeTierra() {
		//calcular prop. de tierra entre todos sus componentes
		return 0;
	}
	
	public List<Topografia> getPartes(){
		return this.partes;
	}
	
	public boolean igual(Topografia t) {
		/*  comparar igualdad entre topografías. Dos topografías son iguales si 
			tienen exactamente la misma composición. Es decir, son iguales las 
			proporciones de agua y tierra, y además, para aquellas que son mixtas, 
			la disposición de sus partes es igual
		*/
		try
		{
			Mixta top = (Mixta) t;
			for(int i=0; i<4; i++) {
				if(! this.partes.get(i).igual(top.getPartes().get(i))) {
					return false;
				}
			}
		}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}
}
