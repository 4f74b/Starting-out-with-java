public class SumCol2D{
    public static void main(String[] args){
        int[][] array={
            {3,5,2,5},
            {23,3,7,3},
            {2,56,8,12},
        };

        int colTotal;
        for (int col=0; col<array[0].length; col++){
            colTotal=0;
            for (int row=0; row<array.length; row++){
                colTotal+=array[row][col];
            }
            System.out.println("Col: "+col+"\nTotal: "+colTotal);
        }

        
    }
}