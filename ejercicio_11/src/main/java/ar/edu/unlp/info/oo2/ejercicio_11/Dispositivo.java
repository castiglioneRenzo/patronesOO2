package ar.edu.unlp.info.oo2.ejercicio_11;

public class Dispositivo {
	private CRC16_Calculator crcCalculator;
	private Ringer ringer;
	private Display display;
	private Connection connection;
	
	public Dispositivo(CRC16_Calculator calculator, Connection connection) {
		this.connection = connection;
		this.crcCalculator = calculator;
		this.ringer = new Ringer();
		this.display = new Display();
	}
	
	public String send(String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	public Display getDisplay() {
		return this.display;
	}
	
	public Connection getConnetcion() {
		return this.connection;
	}
}