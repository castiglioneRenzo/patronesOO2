package ar.edu.unlp.info.oo2.ejercicio_11;

public class Connection4G {
	private String symb;
	
	public Connection4G() {
		this.symb = "4gLTE";
	}
	
	public String symb() {
		return this.symb;
	}
	
	public String transmit(String data, long crc) {
		return data + " crc: " + crc;
	}
}
