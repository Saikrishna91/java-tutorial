package com.java_learnings.streams;

import java.util.stream.Stream;

public class ReduceStreams {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Hello", "World");
		String finalStream = stream.reduce("", (s1, s2) -> s1 + " " + s2);
		System.out.println("Concat String is : " + finalStream);

		Stream<String> stream1 = Stream.of("Car", "Bus", "Train", "Aeroplane", "Ship");
		String value = stream1.reduce("", (n, str) -> n + str.length());
		System.out.println("Final Value : " + value);
	}

}
