package com.java_8_learnings.lambdas;

public class BasicLambda {

	public static void main(String[] args) {
		PrintInterface pi = () -> System.out.println("Printing Message from Lambda Function");
		pi.message();
	}

}

@FunctionalInterface
interface PrintInterface {
	void message();
}
