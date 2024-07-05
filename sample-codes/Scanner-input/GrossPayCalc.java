import java.util.Scanner;

public class GrossPayCalc{
    public static void main(String[] args) {
        String name;
        int hoursWorked;
            
        double hourlyRate, grossPay;
        
        Scanner kb=new Scanner(System.in);
        
        System.out.print("What is your name? ");
        name=kb.nextLine();

        System.out.print("Enter number of hours worked: ");
        hoursWorked=kb.nextInt();

        System.out.print("Enter hourly Pay Rate: ");
        hourlyRate=kb.nextDouble();

        grossPay=hoursWorked * hourlyRate;

        System.out.println(name+"'s Gross Pay is: $"+ grossPay);
    }
}