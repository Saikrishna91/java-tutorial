package com.java_8_learnings.lambdas;

import java.util.function.Predicate;

public class PassLambdaAsParameter {

	public static void main(String[] args) {
		check(4, n -> n % 2 == 0);
		check(5, n -> n % 2 == 0);
	}

	private static <T> void check(T t, Predicate<T> lambda) {
		System.out.println("Value : " + t + " is even : " + lambda.test(t));
	}

}
