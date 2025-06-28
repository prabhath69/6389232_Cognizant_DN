package com.aaatest;

import com.calculator.Calculator;

import org.junit.*;
import static org.junit.Assert.*;

public class AAATest {
	@Before
	public void before() {
		System.out.println("Before Annotation for Setup method");
	}
	
	@After
	public void after() {
		System.out.println("After Annotation for Teardown method");
	}
	
	@Test
	public void testingAddition() {
		int a=10;
		int b=5;
		
		Calculator calc = new Calculator();
		
		int resultOfAddition=calc.add(a, b);
		
		assertEquals(15, resultOfAddition);
		
	}
	
	@Test
	public void testingSubtraction() {
		int a=10;
		int b=5;
		
		Calculator calc = new Calculator();
		
		int resultOfSubtraction=calc.subtract(a, b);
		
		assertEquals(5, resultOfSubtraction);
		
	}
}
