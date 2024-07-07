public class TriangularAsterisks {
    public static void main(String[] args) {
        for (int rows=0; rows<10; rows++){
            for (int cols=0; cols<rows; cols++){
                if(cols==rows-1){
                    System.out.print('#');
                }
                else{
                    System.out.print(' ');
                }

            }
            System.out.println();
        }
    }
}
