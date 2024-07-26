public class BinarySearch {

    public static int bs(int[] arr,int item){
        // run a loop unless the element is found or unless the array can not be search anymore because element is not found
        boolean itemFound=false, noMoreEls=false;
        // set index such that it points to the middle element of the array
        int index=(int)Math.floor(arr.length/2);
        while(!itemFound && !noMoreEls){
            // Check whether the element is equal to the center element or less than it or greater
            System.out.println("index : "+index+" : El : "+arr[index]+" : "+item);
            if (arr[index]==item){
                itemFound=true;
            }
            // Check if index is equal to 0, if so, set noMoreEls to zero
            if(index==0 || index==arr.length-1){
                noMoreEls=true;
                break;
            }
            else if (item<arr[index]){
                index-=(int)Math.floor(index/2);
            }
            else if (item >arr[index]){
                index+=(int)Math.floor(index/2);
            }
            

        }
        if (itemFound){
            return index;
        }else{
            return -1;
        }
    }

   
}
