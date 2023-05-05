package ar.edu.unlp.info.oo2.ejercicio4;

public class Tierra extends Topografia{

	public double proporcionDeAgua() {
		return 0;
	}
	
	public double proporcionDeTierra() {
		return 1;
	}
	
	public boolean igual() {
		/*  comparar igualdad entre topografías. Dos topografías son iguales si 
			tienen exactamente la misma composición. Es decir, son iguales las 
			proporciones de agua y tierra, y además, para aquellas que son mixtas, 
			la disposición de sus partes es igual
		*/
		return false;
	}
}
