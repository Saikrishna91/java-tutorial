package com.java_learnings.streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperators {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Car", "Bus", "Train", "Aeroplane", "Ship");
		
		Map<String, Integer> map = new HashMap<>();
		stream.forEach(x -> {
			map.put(x, x.length());
		});
		
		System.out.println(map);
		
		Stream<String> stream1 = Stream.of("Car", "Bus", "Train", "Aeroplane", "Ship");
		
		Map<String, Integer> newMap = stream1.collect(Collectors.toMap(x -> x, y -> y.length()));
		System.out.println(newMap);
	}

}
