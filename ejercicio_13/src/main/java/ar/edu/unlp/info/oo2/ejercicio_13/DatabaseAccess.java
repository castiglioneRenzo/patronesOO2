package ar.edu.unlp.info.oo2.ejercicio_13;

import java.util.Collection;
import java.util.List;

public interface DatabaseAccess {
	public int insertNewRow(List<String> rowData);
	public Collection<String> getSearchResults(String queryString);
}
