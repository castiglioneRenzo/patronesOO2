package ar.edu.unlp.info.oo2.ejercicio_14;

public class FileDecoratorTamano extends FileDecorator {
	
	public FileDecoratorTamano(File wrapee) {
		super(wrapee);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + (this.getWrappee().getTamano());
	}
}
