public class LoShuMagic {
    public boolean check(int[][] array){
        boolean isLoShu=true;
        int acc;
        // iterate through rows
        for (int row=0; row< array.length; row++){
            acc=0;
            // iterate through elements of a column and add them up, at the end of loop check of sum is 15, if it isn't make isLoShu false
            for (int col=0; col< array[row].length && isLoShu; col++){
                acc+=array[row][col];
            }
            if(acc!=15){
                isLoShu=false;
            }
        }
        return isLoShu;
    }
}
