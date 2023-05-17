package ar.edu.info.unlp.ejercicio_6;
//pattern used template method
public abstract class Empleado {
	private String nombre;
	private String apellido;
	private int dni;
	private double basico;
	
	public Empleado(String nombre, String apellido, int dni, double basico) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.basico = basico;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public void setBasico(double basico) {
		this.basico = basico;
	}
	public double getBasico() {
		return this.basico;
	}
	
	
	public double sueldo() {
		return this.sueldoBasico() + this.sueldoAdicional() - this.descuento();
	}
	public double sueldoBasico() {
		return this.getBasico();
	}
	public double sueldoAdicional() {
		return 0;
	}
	public double descuento() {
		double descuento = this.sueldoBasico() * (0.13);
		descuento += this.sueldoAdicional() * (0.05);
		return descuento;
	}
	
}
