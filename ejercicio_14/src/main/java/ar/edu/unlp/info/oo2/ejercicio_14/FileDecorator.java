package ar.edu.unlp.info.oo2.ejercicio_14;

import java.time.LocalDate;

public abstract class FileDecorator implements File{
	private File wrapee;
	
	public FileDecorator(File wrapee) {
		this.wrapee = wrapee;
	}
	
	public File getWrappee() {
		return this.wrapee;
	}
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return wrapee.getNombre();
	}

	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return wrapee.getExtension();
	}

	@Override
	public LocalDate getFechaDeCreacion() {
		// TODO Auto-generated method stub
		return wrapee.getFechaDeCreacion();
	}

	@Override
	public LocalDate getFechaDeModificacion() {
		// TODO Auto-generated method stub
		return wrapee.getFechaDeModificacion();
	}

	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return wrapee.getPermisos();
	}

	@Override
	public double getTamano() {
		// TODO Auto-generated method stub
		return wrapee.getTamano();
	}

	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return wrapee.prettyPrint() + " - ";
	}

}
