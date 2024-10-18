package com.java_8_learnings.lambdas;

public class NormalImplementation implements Print {

	public static void main(String[] args) {
		NormalImplementation ni = new NormalImplementation();
		ni.message();
	}

	@Override
	public void message() {
		System.out.println("Printing Message from normal Implementation class");
	}
	
}

interface Print {
	void message();
}
