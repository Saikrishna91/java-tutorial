package com.java_8_learnings.lambdas;

import java.util.function.Predicate;

public class PassingPredicate {

	public static void main(String[] args) {
		System.out.println("Is 4 even? " + check(4, number -> number % 2 == 0)); // true
		System.out.println("Is 7 even? " + check(7, number -> number % 2 == 0)); // false

		Person mike = new Person("ABC", 33, 1.8);
		Person ann = new Person("CBAA", 13, 1.4);
		System.out.println("Is Mike an adult? " + check(mike, person -> person.getAge() >= 18)); // true
		System.out.println("Is Ann an adult? " + check(ann, person -> person.getAge() >= 18)); // false
	}

	public static <T> boolean check(T value, Predicate<T> predicate) {
		return predicate.test(value);
	}

	static class Person {
		private String name;
		private int age;
		private double height;

		public Person(String name, int age, double height) {
			this.name = name;
			this.age = age;
			this.height = height;
		}

		public int getAge() {
			return age;
		}
	}

}
