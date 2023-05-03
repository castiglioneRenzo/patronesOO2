package ar.edu.info.unlp.ejercicio_6;

public class Pasante extends Empleado{
	private int cantExamenes;
	
	public Pasante(String nombre, String apellido, int dni, double basico) {
		super(nombre, apellido, dni, basico);
		this.cantExamenes = 0;
	}

	public int getCantExamenes() {
		return cantExamenes;
	}

	public void setCantExamenes(int cantExamenes) {
		this.cantExamenes = cantExamenes;
	}
	
	public double sueldoAdicional() {
		return (2000 * this.cantExamenes);
	}
}
