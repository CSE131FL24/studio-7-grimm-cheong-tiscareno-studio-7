package studio7;

public class HockeyPlayer {
	
	private String name;
	private int jerseyNum;
	private boolean isRightHanded;
	private boolean shootBothWays;
	private int points;
	private int goals;
	private int assists;
	private int games;
	
	public HockeyPlayer(String n, int j, boolean h, boolean s) {
		name = n;
		jerseyNum = j;
		isRightHanded = h;
		shootBothWays = s;
		points = 0;
		goals = 0;
		assists = 0;
		games = 0;
	}
	
	public void game(int g, int a) {
		games++;
		goals += g;
		assists += a;
		points += (g + a);
	}
	
	public String toString() {
		return "Name: " + name + ", Jersey Number: " + jerseyNum + ", Right Handed?: " + isRightHanded + ", Shoots Both Ways?: " + shootBothWays + ", Games: " + games + ", Goals: " + goals + ", Assists: " + assists + ", Points: " + points;
	}

	public static void main(String[] args) {
		HockeyPlayer h1 = new HockeyPlayer("Sam", 17, true, true);
		h1.game(5, 7);
		System.out.print(h1.toString());
	}

}
