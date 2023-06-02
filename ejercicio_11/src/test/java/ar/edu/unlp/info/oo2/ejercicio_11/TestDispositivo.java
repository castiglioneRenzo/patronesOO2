package ar.edu.unlp.info.oo2.ejercicio_11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDispositivo {
	CRC16_Calculator calculator;
	Connection connection;
	Dispositivo dispositivo;
	@BeforeEach
	void setUp() throws Exception {
		calculator = new CRC16_Calculator();
		connection = new WifiConn();
		dispositivo = new Dispositivo(calculator, connection);
	}

	@Test
	void test() {		
		assertEquals(dispositivo.send("hola"), "hola crc: 56651");			
	}

}
