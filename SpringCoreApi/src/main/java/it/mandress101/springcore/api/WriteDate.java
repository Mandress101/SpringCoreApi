package it.mandress101.springcore.api;

import it.mandress101.springcore.utils.Utils;

public class WriteDate {
	
	public static String date(String date_format) {
		return Utils.getDate(date_format);
	}
	
}
