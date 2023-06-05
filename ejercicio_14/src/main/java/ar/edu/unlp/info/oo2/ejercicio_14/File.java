package ar.edu.unlp.info.oo2.ejercicio_14;

import java.time.LocalDate;
import java.util.List;

public interface File {
	String getNombre();
	String getExtension();
	LocalDate getFechaDeCreacion();
	LocalDate getFechaDeModificacion();
	String getPermisos();
	double getTamano();
	String prettyPrint();
}
