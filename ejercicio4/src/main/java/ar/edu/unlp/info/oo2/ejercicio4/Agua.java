package ar.edu.unlp.info.oo2.ejercicio4;

public class Agua extends Topografia {
	
	public double proporcionDeAgua() {
		return 1;
	}
	
	public double proporcionDeTierra() {
		return 0;
	}
	
	public boolean igual(Topografia t) {
		/*  comparar igualdad entre topografías. Dos topografías son iguales si 
			tienen exactamente la misma composición. Es decir, son iguales las 
			proporciones de agua y tierra, y además, para aquellas que son mixtas, 
			la disposición de sus partes es igual
		*/
		if(t.proporcionDeAgua() == 1)
			return true;
		return false;
	}
}
