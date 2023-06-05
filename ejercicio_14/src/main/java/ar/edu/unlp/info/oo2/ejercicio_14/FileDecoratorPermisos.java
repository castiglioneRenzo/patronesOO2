package ar.edu.unlp.info.oo2.ejercicio_14;

public class FileDecoratorPermisos extends FileDecorator {
	
	public FileDecoratorPermisos(File wrapee) {
		super(wrapee);
	}
	
	@Override
	public String prettyPrint() {
		return super.prettyPrint() + (this.getWrappee().getPermisos());
	}
}
