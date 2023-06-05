package ar.edu.unlp.info.oo2.ejercicio_13;

import java.util.Collection;
import java.util.List;

public class ProxyDB implements DatabaseAccess {

	private DatabaseAccess realService;
	private boolean logged = false;
	
	public ProxyDB() {
		this.realService = new DatabaseRealAccess();
	}
	
	public boolean authenticate(String passCode) {
		if(passCode.equals("pepito")) {
			this.logged = true;			
			return true;
		}
		return false;
	}
	public boolean checkAccess() {
		//check if the user has is logged in and has access
		return this.logged;
	}
	
	
	@Override
	public int insertNewRow(List<String> rowData) {
		// TODO Auto-generated method stub
		if(checkAccess()) return this.realService.insertNewRow(rowData);
		return 0;
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		// TODO Auto-generated method stub
		if(checkAccess()) return this.realService.getSearchResults(queryString);
		return null;
	}

}
