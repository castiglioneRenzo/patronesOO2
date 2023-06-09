package ar.edu.info.unlp.ejercicio_6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

	@DisplayName("Empleado Temporario")
	@Test
	void testEmpleadoTemporario() {
		Temporario empleado = new Temporario("Juan", "Palotes", 12312323, 20000);
		empleado.setCantHijos(2);
		empleado.setHorasTrabajadas(24);
		empleado.setCasado(true);
		assertEquals(32214,empleado.sueldo());
	}
	
	@DisplayName("Empleado Pasante")
	@Test
	void testEmpleadoPasante() {
		Pasante empleado = new Pasante("Juan", "Palotes", 12312323, 20000);
		empleado.setCantExamenes(17);
		assertEquals(49700, empleado.sueldo());
	}
	
	@DisplayName("Empleado Planta")
	@Test
	void testEmpleadoPlanta() {
		Planta empleado = new Planta("Juan", "Palotes", 12312323, 50000);
		empleado.setAntiguedad(2);
		empleado.setCasado(true);
		empleado.setCantHijos(0);
		assertEquals(52050, empleado.sueldo());
	}

}
