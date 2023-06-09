package ar.edu.info.unlp.ejercicio_6;

public class Temporario extends Empleado{
	private int horasTrabajadas;
	private int cantHijos;
	private boolean casado;
	
	public Temporario(String nombre, String apellido, int dni, double basico) {
		super(nombre, apellido, dni, basico);
		this.cantHijos = 0;
		this.casado = false;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public int getCantHijos() {
		return cantHijos;
	}
	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}
	public boolean isCasado() {
		return casado;
	}
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
	public double sueldoBasico() {
		double sueldo = this.getBasico();
		sueldo += (this.horasTrabajadas * 300);
		return sueldo;
	}
	
	public double sueldoAdicional() {
		double sueldo = 2000 * this.cantHijos;
		if(this.casado) {sueldo += 5000;}
		return sueldo;
	}

}
