package ar.edu.unlp.info.oo2.ejercicio_11;

public class Connection4GAdapter implements Connection {
	private Connection4G con;
	public Connection4GAdapter() {
		this.con = new Connection4G();
	}
	@Override
	public String sendData(String data, long crc) {		
		return this.con.transmit(data, crc);
	}

	@Override
	public String pict() {	
		return this.con.symb();
	}

}
