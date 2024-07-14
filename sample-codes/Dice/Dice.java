import java.util.Random;
public class Dice {
	private int sides;
	private int value;


	public void setSides(int s){

		sides=s;
	}

	public int getSides(){
		return sides;
	}

	public int rollDice(){
		Random rand = new Random();
		return rand.nextInt(sides) +1;
	}
}