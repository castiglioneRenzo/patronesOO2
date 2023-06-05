package ar.edu.unlp.info.oo2.ejercicio_14;

public class FileDecoratorExtension extends FileDecorator {
	
	public FileDecoratorExtension(File wrapee) {
		super(wrapee);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + (this.getWrappee().getExtension());
	}
}
