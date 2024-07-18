public class SelectionSort{
    int[] array;

    public SelectionSort(int[] arr){
        array=arr;
    }

    public int[] sort(){
        int[] tempArray= new int[array.length];
        int smallestIndex;

        for(int i=0; i<array.length; i++){
            smallestIndex=findIndexOfSmallest();
            tempArray[i]=array[smallestIndex];
            updateOriginalArray(smallestIndex);

            for (int j=0; j<array.length; j++){
                System.out.print(array[j]+", ");
            }
            System.out.println();
        }


        return tempArray;
    }

    private int findIndexOfSmallest(){
        int smallestIndex=0;
        for (int i=0; i<array.length; i++)
            if (array[i]<array[smallestIndex])
                smallestIndex=i;
        return smallestIndex;
    }


    private void updateOriginalArray(int index){
        int[] tempArr=new int[array.length-1];

        for (int i=0; i<index; i++)
            tempArr[i]=array[i];

        for (int j=index+1; j<tempArr.length; j++){
            tempArr[j]=array[j];
        }
        array=tempArr;
    }
}