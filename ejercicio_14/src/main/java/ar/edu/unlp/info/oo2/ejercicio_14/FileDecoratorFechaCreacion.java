package ar.edu.unlp.info.oo2.ejercicio_14;

public class FileDecoratorFechaCreacion extends FileDecorator {
	public FileDecoratorFechaCreacion(File wrapee) {
		super(wrapee);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + (this.getWrappee().getFechaDeCreacion().toString());
	}
}
