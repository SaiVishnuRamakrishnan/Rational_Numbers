package RationalTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import rat.Rational;

public class RationalTest {

	public Rational inputRationalNumber1  = new Rational(3, 5),
			inputRationalNumber2  = new Rational(4, 7),
			expectedResult;

	@Test
	public void testAdd() {
		this.expectedResult = new Rational(41, 35);
		assertEquals(expectedResult.toString(),inputRationalNumber1.add(inputRationalNumber2).toString());
	}

	@Test
	public void testMul() {
		this.expectedResult = new Rational(12, 35);
		assertEquals(expectedResult.toString(),inputRationalNumber1.mul(inputRationalNumber2).toString());
	}

	@Test
	public void testDiv() {
		this.expectedResult = new Rational(21, 20);
		assertEquals(expectedResult.toString(),inputRationalNumber1.divide(inputRationalNumber2).toString());
	}

}
