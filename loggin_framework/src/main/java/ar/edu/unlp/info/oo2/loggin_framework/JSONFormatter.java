package ar.edu.unlp.info.oo2.loggin_framework;

import java.util.logging.*;
import org.json.simple.*;

public class JSONFormatter extends Formatter{

	@Override
	public String format(LogRecord record) {
		JSONObject log = new JSONObject();
		log.put("message", record.getMessage());
		log.put("level", record.getLevel());			
		return log.toJSONString();
	}
	
}
