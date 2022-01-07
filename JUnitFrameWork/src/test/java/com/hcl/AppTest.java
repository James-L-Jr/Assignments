package com.hcl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest{
	@BeforeAll
	static void setUp() {
		System.out.println("@BeforeAll Executed");
	}
	
	@BeforeEach
	void setUpThis() {
		System.out.println("@BeforeEach Executed");
	}
	
	//Test case before implement => TDD
	@Test
	void calculate() {
		System.out.println("@BeforeAll Executed");
		//Assertions.fail("No code has been implemented", new Exception());
		int x = 12;
		int y = 12;
		int a = x + y;
		int b = Add.add(x, y);
		Assertions.assertEquals(a, b);
		System.out.println("Method worked");
	}
}
