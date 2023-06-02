package ar.edu.unlp.info.oo2.ejercicio_11;

public class WifiConn implements Connection {
	private String pict;
	
	public WifiConn() {
		this.pict = "Wifi";
	}
	
	public String sendData(String data, long crc) {
		return data + " crc: " + crc;
	}
	
	public String pict() {
		return this.pict;
	}
}
