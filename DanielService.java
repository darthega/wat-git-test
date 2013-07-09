
//package com.boszdigital.wat-git-test;
import wat-git-test.Camilo;

public class DanielService {

	private int lenght;
	private String name="";
	private Camilo camilo;
	private String hello;

	public void doSomething(){
        System.out.println("Doing something");
	}	
	
	public void doSomething2(){
            length = 1 * 2 * 3;
	    System.out.println("Doing something2");
	}

	public void myConflictingMethod()
	{
		System.out.println("Generating conflicts in Git, with this class");
	}

	public void anotherMethodToTest()
	{
		this.camilo = "I don't know";
		System.out.println("Camilo: are you a man? " + this.camilo);
	}

}