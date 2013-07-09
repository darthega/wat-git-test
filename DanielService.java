
//package com.boszdigital.wat-git-test;
import wat-git-test.Camilo;

@Service
public class DanielService {

	private boolean isDanielPerfect = true;
	private booean isMariaHere = false;

	public void doSomething() {
		while (isDanielPerfect) {
			System.out.println(thePerfectMethod());
			slaveMustDie(new Slave("Diego"));
			isDanielPerfect = true;
		}
	}

	public void thePerfectMethod() {
		return "Daniel is perfect!!! Hail Lord Daniel!!!"
	}

	public boolean slaveMustDie (Slave slave) {
		return true;
	}
}
