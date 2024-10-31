package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	
	public Fraction add(Fraction f) {
		int numerator1 = numerator;
		int denominator1 = denominator;
		int numerator2 = f.numerator;
		int denominator2 = f.denominator;
		numerator1 *= denominator2;
		numerator2 *= denominator1;
		denominator1 *= denominator2;
		denominator2 *= denominator1;
		int newNumerator = numerator1 + numerator2;
		return new Fraction(newNumerator, denominator1);
	}
	
	public Fraction multiply(Fraction f) {
		return new Fraction(numerator * f.numerator, denominator * f.denominator);
	}
	
	public Fraction reciprocal() {
		return new Fraction(denominator, numerator);
	}
	
	public Fraction simplify() {
		int n = numerator;
		int d = denominator;
		for(int i = d; i > 0; i--) {
			if(n % i == 0 && d % i == 0) {
				n /= i;
				d /= i;
			}
		}
		return new Fraction(n, d);
	}
	
	public String toString() {
		return numerator + "/" + denominator;
	}

	public static void main(String[] args) {
		Fraction f1 = new Fraction(2, 3);
		Fraction f2 = new Fraction(5, 10);
		Fraction f3 = new Fraction(12, 16);
		System.out.println(f1.add(f2).toString());
		System.out.println(f2.add(f3).toString());
		System.out.println(f2.multiply(f3).toString());
		System.out.println(f1.reciprocal().toString());
		System.out.println(f1.simplify().toString());
		System.out.println(f2.simplify().toString());
		System.out.println(f3.simplify().toString());
	}

}
