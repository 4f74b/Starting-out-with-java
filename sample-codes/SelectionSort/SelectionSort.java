public class SelectionSort{
    int[] array;

    public SelectionSort(int[] arr){
        array=arr;
    }

    public int[] sort(){
        int smallestEl=array[0];
        int temp=0;
        for (int i=0; i<array.length; i++){
            if (array[i]<smallestEl){
                temp=smallestEl;
                array[0]=smallestEl;
                smallestEl=array[0];
                array[i]=temp;

            }
        }
        return array;
    }
}