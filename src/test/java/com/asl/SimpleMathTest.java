package com.asl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {

	SimpleMath math = new SimpleMath();
	@Test
	void testSum() {
		Double x = 6.2D;
		Double y = 10D;
		Double actual = math.sum(x, y);
		double expected = 16.2D;
		
		Assertions.assertEquals(
				expected, actual, () -> "Test number  "  + x + " + " + y + " not produce, result = " + expected + "!!!");
		Assertions.assertNotNull("Archive null");
		Assertions.assertNotEquals(9D, y, "value y = " + y);
	}
	@Test
	void testSubtration() {
		//SimpleMath math = new SimpleMath();
		Double x = 10.0D;
		Double y = 5.0D;
		Double actual = math.subtration(x, y);
		double expected = 5.0D;
		
		Assertions.assertEquals(
				expected, actual, () -> "Test number  "  + x + " - " + y + " not produce, result = " + expected + "!!!");
		Assertions.assertNotNull("Archive null");
		Assertions.assertNotEquals(6.0D, y, "value y = " + y);
	}
	@Test
	void testMultiplication() {
		Double x = 7.0D;
		Double y = 3.0D;
		Double actual = math.multiplication(x, y);
		double expected = 21.0D;
		
		Assertions.assertEquals(
				expected, actual, () -> "Test number  "  + x + " X " + y + " not produce, result = " + expected + "!!!");
		Assertions.assertNotNull("Archive null");
		Assertions.assertNotEquals(20D, y, "value y = " + y);
	}
	@Test
	void testDivision() {
		Double x = 20.0D;
		Double y = 2.0D;
		Double actual = math.division(x, y);
		double expected = 10.0D;
		
		Assertions.assertEquals(
				expected, actual, () -> "Test number  "  + x + " / " + y + " not produce, result = " + expected + "!!!");
		Assertions.assertNotNull("Archive null");
		Assertions.assertNotEquals(9D, y, "value y = " + y);
	}
	@Test
	void testMean() {
		Double x = 8.0D;
		Double y = 10.0D;
		Double actual = math.mean(x, y);
		double expected = 9.0D;
		
		Assertions.assertEquals(
				expected, actual, () -> "Test number  "  + x + " mean " + y + " not produce, result = " + expected + "!!!");
		Assertions.assertNotNull("Archive null");
		Assertions.assertNotEquals(9D, y, "value y = " + y);
	}
	@Test
	void testSqrt() {
		Double x = 25.0D;
		Double actual = math.squereRoot(x);
		double expected = 5D;
		
		Assertions.assertEquals(
				expected, actual, () -> "Test number  "  + x +   " not produce, result = " + expected + "!!!");
		Assertions.assertNotNull("Archive null");
		Assertions.assertNotEquals(6.0D, x, "value X = " + x);
	}

}
