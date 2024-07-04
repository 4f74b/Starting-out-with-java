public class PayrollCalc{
    public static void main(String[] args) {
        float basePayRate=25F,overTimePayRate=37.5F,regularWages,overTimeWages,totalWages;
        int regularHours=40,overTimeHours=10;

        regularWages=regularHours*basePayRate;
        overTimeWages=overTimeHours*overTimePayRate;
        totalWages=regularWages+overTimeWages;

        System.out.println("Wages for this week are: $"+
            totalWages
        );
    }
};