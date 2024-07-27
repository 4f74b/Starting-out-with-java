import java.util.Scanner;

public class DemoBinarySearch {
    public static void main(String[] args) {
        int[] array = { 3, 4, 15, 1, 7, 8, 23, 12, 6, 223, 2 };
        int item, res;
        Scanner kb = new Scanner(System.in);

        // First Sort the array
        SelectionSort.ss(array);

        System.out.println("This is the array");
        for (int el : array) {
            System.out.print(el+", ");
        }
        System.out.println();


        System.out.print("Enter Element that you want to find: ");
        item=kb.nextInt();

        res=BinarySearch.bs(array, item);
        if (res==-1){
            System.out.println(item+" was not present in the array");
        }
        else{
            System.out.println("Item was found at index : "+res+" of the array");
        }

    }
}
