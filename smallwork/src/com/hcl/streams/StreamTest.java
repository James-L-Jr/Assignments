package com.hcl.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTest {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(12345, "Alice", "Jul 20", 24, 45050.00));
		list.add(new Employee(12346, "Bob", "Sep 8", 48, 9000.00));
		list.add(new Employee(12347, "Chuck", "Jan 1", 59, 76400.00));
		list.add(new Employee(12348, "Delta", "Dec 17", 32, 8400.00));
		
		System.out.println("Filter by Age > 30, and name starts with B or D, and salary > 1000\n");
		System.out.println("WITH STREAM API");
		
		//Stream API and parallel stream and forEach and lambda expression
		list.parallelStream().filter(emp -> emp.getAge() > 30 && (emp.getName().startsWith("B") || emp.getName().startsWith("D")) && emp.getSalary() > 1000)
			.forEach(emp -> emp.printEmp());
		
		System.out.println("\nWITHOUT STREAM API");
		for(Employee emp : list) {
			if(emp.getAge() > 30 && (emp.getName().startsWith("B") || emp.getName().startsWith("D")) && emp.getSalary() > 1000)
				emp.printEmp();
		}
	}
}
