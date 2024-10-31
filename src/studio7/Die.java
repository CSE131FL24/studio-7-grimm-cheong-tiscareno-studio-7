package studio7;

public class Die {
	
	private int sides;
	
	public Die(int n) {
		sides = n;
	}
	
	public int roll() {
		return (int)((Math.random() * sides) + 1);
	}

	public static void main(String[] args) {
		Die die1 = new Die(7);
		System.out.println(die1.roll());
		Die die2 = new Die(11);
		System.out.println(die2.roll());
		Die die3 = new Die(3);
		System.out.println(die3.roll());
	}

}
