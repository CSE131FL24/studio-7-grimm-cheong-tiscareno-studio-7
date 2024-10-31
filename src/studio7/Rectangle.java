package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	public double area() {
		return length * width;
	}
	
	public double perimeter() {
		return (length * 2) + (width * 2);
	}
	
	public boolean smallerArea(double area) {
		double localArea = area();
		if (localArea < area) {
			return true;
		}
		return false;
	}
	
	public boolean square() {
		if (length == width) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2, 3);
		Rectangle r2 = new Rectangle(3, 3);
		System.out.println(r1.area());
		System.out.println(r1.perimeter());
		System.out.println(r2.area());
		System.out.println(r2.perimeter());
		System.out.println(r1.smallerArea(r2.area()));
		System.out.println(r1.square());
		System.out.println(r2.square());
	}

}
