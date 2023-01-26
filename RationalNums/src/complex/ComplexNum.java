/**
 * 
 */
package complex;

/**
 * @author richi
 *
 */
public interface ComplexNum {
	//public double real;
	//public final double imag;
	public ComplexNum add(ComplexNumber other);
	public ComplexNum sub(ComplexNum other);
	public ComplexNumber mul(ComplexNumber other);
	public ComplexNumber div(ComplexNumber other);
	

}
