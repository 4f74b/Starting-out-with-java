import java.util.Scanner;

public class DemoDice{
	public static void main(String[] args){
		boolean keepRolling=true;
		Scanner kb= new Scanner(System.in);
		Dice dice=new Dice();
		System.out.println("Enter the sides of the Dice");
		dice.setSides(kb.nextInt());

		kb.nextLine();



		do{
			System.out.print("\n\n=================\nPress enter to roll again \nOR\nPress any other alphanumeric key and press enter to terminate the program: ");
			
			if (kb.nextLine()==""){
				System.out.println("Rolling Dice");
				System.out.print("\n.\n.\n.\n.\n");

				System.out.print("It rolled up a:\n___\n|"+dice.rollDice()+"|\n---");
			}
			else{
				keepRolling=false;
				System.out.println("\n\n=======================================\n                   Bye\n=======================================\n\n");
			}
			
		}
		while (keepRolling);
	}
}

