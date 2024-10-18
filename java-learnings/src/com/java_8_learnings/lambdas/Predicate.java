package com.java_8_learnings.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Predicate {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        
        java.util.function.Predicate<Integer> predicate = number -> number % 2 == 0;
        numbers.forEach(number -> {
        	if(predicate.test(number)) {
        		System.out.println("Even numbers are : "+ number);
        	}
        });
        
	}

}
