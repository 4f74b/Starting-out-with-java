public class SelectionSort{
    int[] array;

    public SelectionSort(int[] arr){
        array=arr;
    }

    public int[] sort(){
        int smallestEl=array[0];
        int tempIndex=0;
        for (int j=0; j<array.length; j++){
            for (int i=0; i<array.length; i++){
                if (array[i]<smallestEl){
                    tempIndex=i;
                }
            }
            array[0]=array[tempIndex];
            array[tempIndex]=smallestEl;
        }
        return array;
    }
}