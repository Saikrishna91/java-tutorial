package com.java_learnings.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageAgeStreams {

	private static int totalAge = 0;
	private static int counter = 0;

	public static void main(String[] args) {

		List<Integer> ages = Arrays.asList(25, 22, 57, 66, 72, 14, 12);
		ages.forEach(i -> {
			if (i > 18) {
				totalAge = totalAge + i;
				counter++;
			}
		});
		
		System.out.println("Sum of total age above 18 : " + totalAge);
		System.out.println("Counter is  : " + counter);
		
		if (counter > 0) {
			int averageAge = totalAge / counter;
			System.out.println("Average age from the list : " + averageAge);
			List<Integer> newList = ages.stream().filter(i -> i > averageAge).collect(Collectors.toList());
			System.out.println("New age List : " + newList);
		}
		
		double averageAge = ages.stream()
                .filter(i -> i > 18)
                .mapToInt(i -> i)
                .average()
                .orElse(0.0);

        System.out.println("Average age from the list : " + averageAge);
        
        List<Integer> newList = ages.stream()
                .filter(i -> i > averageAge)
                .collect(Collectors.toList());

        System.out.println("New age List : " + newList);
		
	}

}
