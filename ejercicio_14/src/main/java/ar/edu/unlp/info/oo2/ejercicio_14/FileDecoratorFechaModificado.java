package ar.edu.unlp.info.oo2.ejercicio_14;

public class FileDecoratorFechaModificado extends FileDecorator {
	
	public FileDecoratorFechaModificado(File wrapee) {
		super(wrapee);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + (this.getWrappee().toString());
	}
}
