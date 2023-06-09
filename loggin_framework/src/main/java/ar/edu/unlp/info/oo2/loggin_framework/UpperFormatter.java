package ar.edu.unlp.info.oo2.loggin_framework;

import java.util.logging.*;

public class UpperFormatter extends SimpleFormatter {
	@Override
	public String format(LogRecord record) {
		return "\n" + record.getLevel() + ": " + record.getMessage() + "\n";
//		return super.format(record).toUpperCase();
	}
}
