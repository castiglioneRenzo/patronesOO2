package ar.edu.unlp.info.oo2.loggin_framework;

import java.util.Collection;
import java.util.List;
import java.util.logging.*;

public class ProxyDB implements DatabaseAccess {

	private DatabaseAccess realService;
	private boolean logged = false;
	
	public ProxyDB() {
		this.realService = new DatabaseRealAccess();
		LogManager.getLogManager().reset();
		ConsoleHandler handler = new ConsoleHandler();
		handler.setFormatter(new JSONFormatter());			
		handler.setLevel(Level.SEVERE);
		Logger.getLogger(ProxyDB.class.getName()).addHandler(handler);
		handler = new ConsoleHandler();
		handler.setFormatter(new UpperFormatter());			
		handler.setLevel(Level.INFO);
		Logger.getLogger(ProxyDB.class.getName()).addHandler(handler);
	}
	
	public boolean authenticate(String passCode) {
		if(passCode.equals("pepito")) {
			this.logged = true;			
			return true;
		}
		else {
			Logger.getLogger(ProxyDB.class.getName()).log(Level.SEVERE, "Acceso Inválido");
		}
		return false;
	}
	
	public boolean checkAccess() {
		//check if the user has is logged in and has access
		if (this.logged) {
			this.logged = false;
			return true;
		}
		return false;
		
	}
	
	
	@Override
	public int insertNewRow(List<String> rowData) {
		// TODO Auto-generated method stub
		if(checkAccess()) {
			Logger.getLogger(ProxyDB.class.getName()).log(Level.WARNING, "Acceso válido | inserción");
			return this.realService.insertNewRow(rowData);
		}
		return 0;
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		// TODO Auto-generated method stub
		if(checkAccess()) {
			Logger.getLogger(ProxyDB.class.getName()).log(Level.INFO, "Acceso Válido | búsqueda");
			return this.realService.getSearchResults(queryString);
		}
		return null;
	}

}
