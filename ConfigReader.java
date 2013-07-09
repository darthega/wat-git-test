package com.config;

public abstract class ConfigReader {

	public abstract String readConfig();
	
	public static void printConfigReader() {
		
		System.out.println("ConfigReader");
	}

	public static void doSomething(){
		System.out.println("This is a test");
	}
}
