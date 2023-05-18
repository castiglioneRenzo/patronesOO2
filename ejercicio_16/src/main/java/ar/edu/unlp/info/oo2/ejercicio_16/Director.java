package ar.edu.unlp.info.oo2.ejercicio_16;

public class Director {
	private Builder builder;
	
	public Director(Builder builer) {
		this.builder = builder;
	}
	
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public void make(String type) {
		//tell the builder steps to build
		if(type == "combinado") {
			builder.nuevaCompraDolares(250);
			builder.nuevoPlazoFijo(30, 50);
			builder.nuevaCompraPesos(0.2);
			builder.nuevoPlazoFijoRenovable(60, 80);
		}
		else {
			System.out.println("no se especifico un tipo definido");
		}
	}
}
