import javax.sound.midi.SysexMessage;

public class SelectionSort {
    int[] array;

    public SelectionSort(int[] arr) {
        array = arr;
    }

    public int[] sort() {
        int smallestIndex, smallestValue,temp;

        // for (int startScan = 0; startScan < (array.length - 1); startScan++) {
        //     smallestIndex = startScan;
        //     smallestValue = array[startScan];
        //     for (int index = startScan + 1; index < array.length; index++) {
        //         if (array[index] < smallestValue) {
        //             smallestValue = array[index];
        //             smallestIndex = index;
        //         }
        //     }

        //     array[smallestIndex] = array[startScan];
        //     array[startScan] = smallestValue;

        // }

        for (int startScan=0; (startScan<array.length-1); startScan++){
            smallestIndex=startScan;
            for (int index=startScan; index<array.length; index++){
                if (array[index] < array[smallestIndex]){
                    smallestIndex=index;
                }
            }
            temp=array[startScan];
            array[startScan]=array[smallestIndex];
            array[smallestIndex]=temp;
        }

        return array;
    }
}