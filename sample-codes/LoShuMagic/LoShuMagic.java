public class LoShuMagic {
    public boolean check(int[][] array){
        boolean isLoShu=true;
        int sum;
        // iterate through rows
        for (int row=0; row< array.length; row++){
            sum=0;
            // iterate through elements of a column and add them up, at the end of loop check of sum is 15, if it isn't make isLoShu false
            for (int col=0; col< array[row].length && isLoShu; col++){
                sum+=array[row][col];
            }
            if(sum!=15){
                isLoShu=false;
            }
        }

        // iterate through cols
        for (int col=0; col<array[0].length; col++){
            sum=0;
            for (int row=0; row<array.length; row++){
                sum+=array[row][col];
            }
            if (sum!=15)
                isLoShu=false;
        }
        return isLoShu;
    }
}
