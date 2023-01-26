/**
 * 
 */
package rat;

/*
 * Class to create an interpretation for Rational numbers.
 * This helps us to Abstract to the level
 * Abstract Value: a rational number
 * Limitation to this abstraction(Abstratct Invariant): 
 * 			the Value represented is in a set
 * 				{ a/b | -2^(31) <= a < 2^31
 * 						0 < b < 2^31		} 
 */
public class Rational {
	//Object invariant:
	// -2^31 <= x < 2^31
	//	0 < y < 2^31	
	// Represnetation relation:
	//	The Abstratct value is x divided by y.
		
	protected int numer; // Numerator
	protected int denom; // Denominator
	
	public Rational(int x, int y) {
		//assert y > 0;
		
		numer=x;
		denom=y;
		//Rational result = new Rational(0,0);
	}
	//Rational result = new Rational(0,0);
	public Rational add(Rational other) {
		Rational result = new Rational(0,0);
		result.numer  = numer*other.denom + other.numer*denom;
		result.denom = denom*other.denom;
		return result;
	}

	public Rational mul(Rational other) {
		Rational result = new Rational(0,0);
		result.numer = numer*other.numer;
		result.denom = denom*other.denom;
		return result;
	}
	
	public String toString() {
		return "(" + numer + "/" + denom + ")" ;
	}
	
	public Rational divide(Rational other) {
		Rational result = new Rational(0,0);
		result.numer = numer*other.denom;
		result.denom = denom*other.numer;
		
		
		return result;
	}
	
public static void main(String [] args) {
	Rational rat1 = new Rational(3, 5);
	Rational rat2 = new Rational(4,7);
	Rational result = rat1.add(rat2);
	Rational resmul = rat1.mul(rat2);
	Rational resdiv = rat1.divide(rat2);
	result.toString();
	resmul.toString();
	resdiv.toString();
	
	System.out.println(result.toString());
	System.out.println(resmul.toString());
	System.out.println(resdiv.toString());
}

}

