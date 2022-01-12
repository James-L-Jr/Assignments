package com.hcl.streams;

public class Employee {
	private int id;
	private String name;
	private String dob;
	private int age;
	private double salary;
	
	public Employee(int id, String name, String dob, int age, double salary){
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getDOB() {
		return dob;
	}
	
	public void printEmp() {
		System.out.println("Employee:" + id + " " + name + " DOB:" + dob + " Age:" + age + " Salary:" + salary);
	}
}
