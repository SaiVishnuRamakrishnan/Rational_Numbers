package complexTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import complex.ComplexNumber;

public class ComplexNumbersTest {

	public ComplexNumber inputComplexNumber1  = new ComplexNumber(10,-5),
			inputComplexNumber2  = new ComplexNumber(1,1),
			expectedResult;

	@Test
	public void testAdd() {
		this.expectedResult = new ComplexNumber(11.0, -4.0);
		assertEquals(expectedResult.toString(),inputComplexNumber1.add(inputComplexNumber2).toString());
	}

	@Test
	public void testMul() {
		this.expectedResult = new ComplexNumber(15.00, 5.0);
		assertEquals(expectedResult.toString(),inputComplexNumber1.mul(inputComplexNumber2).toString());
	}

	@Test
	public void testDiv() {
		this.expectedResult = new ComplexNumber(2.5, -3.75);
		assertEquals(expectedResult.toString(),inputComplexNumber1.div(inputComplexNumber2).toString());
	}

}
