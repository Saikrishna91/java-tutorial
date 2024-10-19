package com.java_learnings.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsBasic {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 2));

		Predicate<Integer> predicate = x -> x == 2;
		System.out.println(list.stream().anyMatch(x -> predicate.test(x)));

		List<Integer> newList = list.stream().filter(x -> predicate.test(x)).collect(Collectors.toList());
		System.out.println("New List contains element matched : " + newList);

		IntStream.range(0, list.size())
				.filter(i -> list.get(i).equals(2))
				.peek(System.out::println)
				.forEach(i -> System.out.println("Found " + 2 + " at index: " + i));
	}

}
