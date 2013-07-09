package com.config;

public abstract class ConfigReader {

	public abstract String readConfig();
	
	public static void printConfigReader() {
		
		System.out.println("ConfigReader");
	}
}
