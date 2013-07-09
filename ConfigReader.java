package com.config;

public abstract class ConfigReader {

	public abstract String readConfig();
	
	public static ConfigReader getConfigReader() {
		
		return new PropertyConfigReader();
	}
}
