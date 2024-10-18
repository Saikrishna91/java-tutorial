package com.java_8_learnings.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.IntStream;

import org.json.JSONObject;

public class FunctionAndBiFunction {

	public static void main(String[] args) {
		Function<String, JSONObject> fn1 = (str1) -> {
			return new JSONObject().put(str1, false);
		};

		JSONObject jsonObj = new JSONObject();
		IntStream.range(1, 10).forEach(i -> {
			if (i % 2 != 0) {
				JSONObject length2 = fn1.apply(Integer.toString(i));
				jsonObj.put(length2.keys().next(), length2.getBoolean(length2.keys().next()));
			}
		});
		System.out.println(jsonObj);

		BiFunction<Integer, Integer, Integer> addFunction = (a, b) -> a + b;
		Integer result = addFunction.apply(5, 10);
		System.out.println("Sum: " + result);

	}

}
