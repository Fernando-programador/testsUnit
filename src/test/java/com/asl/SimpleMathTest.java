package com.asl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SimpleMathTest {

	@Test
	void test() {
		SimpleMath math = new SimpleMath();
		Double actual = math.sum(6.2D, 9.0D);
		double expect = 15.2D;
		
		Assertions.assertEquals(expect, actual);
	}

}
