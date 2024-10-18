package com.java_8_learnings.lambdas;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierAndConsumer {

	public static void main(String[] args) {
		Supplier<Integer> supplier = () -> new Random().nextInt(10);
		Consumer<Integer> consumer = number -> System.out.println("Provided numbers is : " + number);
		int number = supplier.get();
		consumer.accept(number);
		
		
		BiConsumer<Integer, Integer> biConsumer = (number1, number2) -> System.out.println("Adding of numbers is : and : " + (number1 + number2));
		int num = supplier.get();
		System.out.println("Random Number is : " + num);
		biConsumer.accept(num, 2);
	}

}
