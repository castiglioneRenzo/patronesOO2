package ar.edu.unlp.info.oo2.ejercicio_11;

public class Dispositivo {
	private CRC16_Calculator crcCalculator;
	private Ringer ringer;
	private Display display;
	private Connection connection;
	
	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
}
