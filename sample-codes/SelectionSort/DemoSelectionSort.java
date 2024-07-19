public class DemoSelectionSort{
    public static void main(String[] args){
        int[] array= {13,6,7,11,34,4,91,8,7};

        SelectionSort ss= new SelectionSort(array);
        array=ss.sort();

        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+", ");
        }
    }
}