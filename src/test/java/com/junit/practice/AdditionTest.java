package com.junit.practice;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class AdditionTest{
	@Test
	public void fourminusTwominusTwo() {
		Calculator onj=new Subtraction();
		assertEquals(1,onj.performOperation(4,2,2));
	}
	
	@Test
	public void FourplusFourEqualsEight() {
		Calculator obj4 = new Addition();
		assertEquals(8, obj4.performOperation(4,4));
	}
}