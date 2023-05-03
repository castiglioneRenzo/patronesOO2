package ar.edu.unlp.info.oo2.biblioteca;

public class Main {
	public static void main(String[] args) {
		Biblioteca b = new Biblioteca();
		b.agregarSocio(new Socio("Arya Stark", "gmail", "644545"));
		b.agregarSocio(new Socio("Tyrion Lannister", "outool", "980980"));
		System.out.println(b.exportarSocios());
		JSONAdapter jadap = new JSONAdapter();
		b.setExporter(jadap);
		System.out.println(b.exportarSocios());
	}
}
