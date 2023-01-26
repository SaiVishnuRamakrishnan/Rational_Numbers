package rat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRat {

	//@Test
	void test() {
		Rational rat1 = new Rational(3, 5);
		Rational rat2 = new Rational(4,7);
		Rational result=
		rat1.add(rat2);
		assertEquals(41, 35, result.toString());

	}

}
