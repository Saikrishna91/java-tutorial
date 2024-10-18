package com.java_8_learnings.lambdas;

import java.util.ArrayList;
import java.util.List;

public class BiPredicate {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		java.util.function.BiPredicate<Integer, Integer> biPredicate = (number, divisor) -> number % divisor == 0;
		int divisor = 2;
		numbers.forEach(number -> {
			if (biPredicate.test(number, divisor)) {
				System.out.println("Even numbers are: " + number);
			}
		});
	}

}
