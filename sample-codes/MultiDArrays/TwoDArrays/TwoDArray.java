import java.util.Scanner;
public class TwoDArray{

    public static void main(String[] args){
        String[][] array;
        Scanner kb= new Scanner(System.in);
        System.out.print("How many Rows should this array have: ");
        final int ROWS= kb.nextInt();
        System.out.print("\nHow many Columns should this array have: ");
        final int COLUMNS=kb.nextInt();
        array= new String[ROWS][COLUMNS];
        kb.nextLine();

        // Filling the array
        for (int i=0; i<ROWS; i++)
            for (int j=0; j<COLUMNS; j++){
                System.out.print("\nEnter element in row: "+(i+1)+" and column: "+(j+1)+": ");
                array[i][j]=kb.nextLine();
            }
        
        System.out.println("\nThe array is filled");

        
        // Reading from the array
        for (int i=0; i<ROWS; i++){
            for (int j=0; j<COLUMNS; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Number of Rows: "+array.length);
        System.out.println("Numbrer of Columns: "+ array[0].length);

    }


}