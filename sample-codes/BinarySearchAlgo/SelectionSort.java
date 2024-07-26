
public class SelectionSort {
    public static int[] ss(int[] array){
        int smallestValue=array[0], smallestIndex=0,temp;
        for (int startScan=0; startScan<array.length; startScan++){
            smallestIndex=startScan;
            smallestValue=array[startScan];
            for (int index=startScan; index<array.length; index++){
                if(array[index]<array[smallestIndex]){
                    smallestIndex=index;
                    smallestValue=array[index];
                }
            }
            array[smallestIndex]=array[startScan];
            array[startScan]=smallestValue;
        }
        return array;
    }    
}
