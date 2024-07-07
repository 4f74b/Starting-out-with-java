import java.util.Scanner;

public class CheckTemp {
    public static void main(String[] args) {
        float temp;

        System.out.print("Enter Substance's temperature: ");
        Scanner kb= new Scanner(System.in);

        temp=kb.nextFloat();

        while (temp>102.5){
            System.out.print("Turn down thermostate, wait 5 mins and check temperature again.");

            System.out.print("\nEnter Substance's temperature: ");
            temp=kb.nextFloat();
        }

        System.out.print("The temperature is acceptable. Check it again in 15 minutes.");
    }
}
