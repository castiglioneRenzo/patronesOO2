package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import org.json.simple.parser.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BibliotecaTest {
	private Biblioteca biblioteca;
	
	@BeforeEach
	void setUp() throws ParseException {
		biblioteca = new Biblioteca();
		biblioteca.setExporter(new JSONAdapter());
	}
	
	@Test
	void test() throws ParseException {		
		biblioteca.agregarSocio(new Socio("Arya Stark", "gmail", "644545"));
		biblioteca.agregarSocio(new Socio("Tyrion Lannister", "outool", "980980"));
		
		String textoSalida = "[\r\n"
				+ "	{\r\n"
				+ "		\"nombre\": \"Arya Stark\",\r\n"
				+ "		\"email\": \"gmail\",\r\n"
				+ "		\"legajo\": \"644545\"\r\n"
				+ "	},\r\n"
				+ "	{\r\n"
				+ "		\"nombre\": \"Tyrion Lannister\",\r\n"
				+ "		\"email\": \"outool\",\r\n"
				+ "		\"legajo\": \"980980\"\r\n"
				+ "	}\r\n"
				+ "]";
		JSONParser parser = new JSONParser();
		assertEquals(parser.parse(textoSalida), parser.parse(biblioteca.exportarSocios()));
	}

}
