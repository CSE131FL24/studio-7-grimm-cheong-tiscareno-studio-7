package studio7;

public class Complex {
	
	private double real;
	private double imaginary;
	
	public Complex(double r, double i) {
		real = r;
		imaginary = i;
	}
	
	public Complex add(Complex c) {
		return new Complex(real + c.real, imaginary + c.imaginary);
	}
	
	public Complex multiply(Complex c) {
		return new Complex ((real * c.real) - (imaginary * c.imaginary), (real * c.imaginary) + (imaginary * c.real));
	}
	
	public String toString() {
		return real + " + " + imaginary + "i";
	}

	public static void main(String[] args) {
		Complex c1 = new Complex(4, 5);
		Complex c2 = new Complex(1, 3);
		System.out.println(c1.add(c2).toString());
		System.out.println(c1.multiply(c2).toString());
	}

}
