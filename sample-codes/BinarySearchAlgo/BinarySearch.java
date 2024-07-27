public class BinarySearch {

    public static int bs(int[] arr,int item){
        // run a loop unless the element is found or unless the array can not be search anymore because element is not found
        boolean itemFound=false, noMoreEls=false;
        // set mid variable such that it points to the middle element of the array
        int lowerBound=0, upperBound=arr.length-1,mid=(int)Math.floor((lowerBound+upperBound)/2);
        while (itemFound==false && noMoreEls==false){
            
            if(arr[mid]==item){
                itemFound=true;
                System.out.println("element found");
            }
            // after comparison, if upper bound is one more that lower bound, then break the loop
            if(upperBound==lowerBound+1){
                noMoreEls=true;
            }
            if (item>arr[mid]){
                lowerBound=mid;
                mid+=(int)Math.floor((upperBound-lowerBound)/2);
            }
            else if (item < arr[mid]){
                upperBound=mid;
                mid-=(int)Math.floor((upperBound-lowerBound)/2);
            }
            // System.out.println("upperbound: "+upperBound+", LowerBound: "+lowerBound+", Mid: "+mid);
        }
        if (itemFound){
            return mid;
        }else{
            return -1;
        }
    }

   
}
