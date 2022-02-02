package it.mandress101.springcore.api;

import it.mandress101.springcore.manager.SHAKeyManager;

public class CryptationService {
	
	public static String cryptstr(String key) {
		return SHAKeyManager.CryptSting(key);
	}
	
}
