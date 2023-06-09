package ar.edu.info.unlp.ejercicio_6;

public class Planta extends Empleado{
	private boolean casado;
	private int cantHijos;
	private int antiguedad;
	
	public Planta(String nombre, String apellido, int dni, double basico) {
		super(nombre, apellido, dni, basico);
	}
	
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public int getCantHijos() {
		return cantHijos;
	}
	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public double sueldoAdicional() {
		/**$5.000 si está casado
		  *$2.000 por cada hijo
		  *$2.000 por cada año de antigüedad
		*/
		double adicional;
		adicional = 2000 * this.getCantHijos();
		adicional += 2000 * this.getAntiguedad();
		if(this.isCasado()) {adicional += 5000;}
		return adicional;
	}
	
	
}
