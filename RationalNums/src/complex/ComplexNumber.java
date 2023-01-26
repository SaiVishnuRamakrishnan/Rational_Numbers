/**
 * 
 */
package complex;

/**
 * @author richi
 *
 */
public class ComplexNumber {
	
	public double real;
	public double imag;

	/**
	 * 
	 */
	public ComplexNumber(double real, double imag) {
		this.real=real;
		this.imag=imag;
	}

	public String toString() {
		return "(" + real + " + " + imag + "i" + ")";
	}
	
	public ComplexNumber add(ComplexNumber other) {
		return new ComplexNumber ((real + other.real),  (imag + other.imag)) ;
	}
	
	public ComplexNumber mul(ComplexNumber other) {
		return new ComplexNumber((real *other.real - imag*other.imag), (real*other.imag + imag*other.real));	
	}
	
	public ComplexNumber div(ComplexNumber other) {
		real = (real*other.real + imag*other.imag)/(other.real*other.real + other.imag*other.imag);
		imag = (imag*other.real - real*other.imag)/(other.real*other.real + other.imag*other.imag);
		return new ComplexNumber(real, imag);
	}
	
	public ComplexNumber squareroot() {
		return null;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ComplexNumber c1 = new ComplexNumber(10,-5);
		ComplexNumber c2 = new ComplexNumber(1,1);
		System.out.println(c1.div(c2).toString());
		
		
	}

}
