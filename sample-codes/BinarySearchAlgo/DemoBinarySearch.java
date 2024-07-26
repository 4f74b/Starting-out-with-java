public class DemoBinarySearch {
    public static void main(String[] args) {
        int[] array = { 3, 4, 2, 15, 1, 7, 8,23,23,12,6,2,6,223,2 };

        // First Sort the array
        SelectionSort.ss(array);

        for (int el: array){
            System.out.println(el);
        }
    }
}
