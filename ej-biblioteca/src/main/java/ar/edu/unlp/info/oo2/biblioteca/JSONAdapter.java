package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.*;
import java.util.List;

public class JSONAdapter extends VoorheesExporter {
	public String exportar(List<Socio> socios) {
		JSONArray lSocios = new JSONArray();
		for(Socio socio: socios) {
			JSONObject o = new JSONObject();
			o.put("nombre", socio.getNombre());
			o.put("email", socio.getEmail());
			o.put("legajo", socio.getLegajo());
			lSocios.add(o);
		}
		return lSocios.toString();
	}
}
