package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;
import java.util.List;

interface IArchivo {
	public String getNombre();
	public int tamanoTotalOcupado();
	public LocalDate getFechaDeCreacion();
	public List<IArchivo> getArchivos();
}
