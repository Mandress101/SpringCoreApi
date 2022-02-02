package it.mandress101.springcore.api;

import it.mandress101.springcore.utils.Utils;

public class Logger {

	public static void logger(String message, int severity) {
		Utils.log(message, severity);
	}
	
}
