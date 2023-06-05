package ar.edu.unlp.info.oo2.ejercicio_14;

public class FileDecoratorNombre extends FileDecorator {
	
	public FileDecoratorNombre(File wrapee) {
		super(wrapee);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + (this.getWrappee().getNombre());
	}
}
