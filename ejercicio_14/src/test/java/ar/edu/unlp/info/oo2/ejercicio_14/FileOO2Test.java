package ar.edu.unlp.info.oo2.ejercicio_14;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileOO2Test {
	private FileOO2 file;
	@BeforeEach
	void setUp() throws Exception {
		file = new FileOO2("arc1","txt",32,LocalDate.now(), LocalDate.now(), "all");
	}

	@Test
	void test() {
		File d = new FileDecoratorNombre(file);
		File d1 = new FileDecoratorExtension(d);
		File d2 = new FileDecoratorTamano(d1);
		File d3 = new FileDecoratorFechaCreacion(d2);		
		assertEquals(" - arc1 - txt - 32.0 - 2023-06-05", d3.prettyPrint());
	}

}
