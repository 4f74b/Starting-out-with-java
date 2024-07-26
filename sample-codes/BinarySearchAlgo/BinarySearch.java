public class BinarySearch {
    int[] array={3,4,2,5,1,7,8};
    public static void main(String[] args) {
        
    }

    public int binarySearch(int item){

    }

    public int[] selectionSort(){
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
    }
}
