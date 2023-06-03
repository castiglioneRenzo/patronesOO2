package ar.edu.unlp.info.oo2.ejercicio_11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
		assertEquals("hola crc: 56651", dispositivo.send("hola"));			
	}
	
	
	@DisplayName("Test 4G")
	@Test
	void test4G() {
		dispositivo.setConnection(new Connection4GAdapter());
		assertEquals("4gLTE", dispositivo.getConnetcion().pict());
		assertEquals("hola crc: 56651", dispositivo.send("hola"));
	}

	// crc para crc32 1872820616
	@DisplayName("Test CRC32")
	@Test
	void testCRC32() {
		dispositivo.setCalculator(new CRC32_Calculator());
		assertEquals("hola crc: 1872820616", dispositivo.send("hola"));
	}
}
