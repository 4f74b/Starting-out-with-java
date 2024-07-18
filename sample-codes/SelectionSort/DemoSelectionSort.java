public class DemoSelectionSort{
    public static void main(String[] args){
        int[] array= {3,6,23,7,1,3,7};

        SelectionSort ss= new SelectionSort(array);
        array=ss.sort();

        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+", ");
        }
    }
}