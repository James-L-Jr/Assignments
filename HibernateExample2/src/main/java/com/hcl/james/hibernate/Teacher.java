package com.hcl.james.hibernate;

public class Teacher {

	private int id;
	private String firstName;
	private String lastName;
	private String gradeLevel;

	public Teacher() {
	}

	public Teacher(int id, String firstName, String lastName, String gradeLevel) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gradeLevel = gradeLevel;

	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

}
