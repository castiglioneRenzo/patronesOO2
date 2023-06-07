package ar.edu.unlp.info.oo2.loggin_framework;

import java.util.Collection;
import java.util.List;

public interface DatabaseAccess {
	public int insertNewRow(List<String> rowData);
	public Collection<String> getSearchResults(String queryString);
}
