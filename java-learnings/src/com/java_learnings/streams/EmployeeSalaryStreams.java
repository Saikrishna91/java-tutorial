package com.java_learnings.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalaryStreams {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee("Alice", 45000), 
				new Employee("Bob", 60000),
				new Employee("Charlie", 70000), 
				new Employee("Diana", 48000));

		List<Employee> updatedEmployeeNames = employees.stream()
											.filter(e -> e.getSalary() <= 50000)
											.peek(e -> e.setSalary(e.getSalary() * 1.15))
											.collect(Collectors.toList());

		updatedEmployeeNames.forEach(i -> {
			System.out.println(i.getName() + "---" + i.getSalary());
		});

	}

}

class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
