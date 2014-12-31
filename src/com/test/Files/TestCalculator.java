package com.test.Files;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void test() {
		Calculator c = new Calculator();
		assertEquals(12, c.add(5, 7));
	}

}
