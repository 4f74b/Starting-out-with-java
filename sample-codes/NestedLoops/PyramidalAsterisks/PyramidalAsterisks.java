public class PyramidalAsterisks {
    public static void main(String[] args) {
        int rows=5, cols=5;

        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                // System.out.print(j+" : "+Math.ceil((float)cols/2));
                if (j==Math.ceil((float)cols/2)-i){
                    for(int k=0; k<i+i+1; k++){
                        System.out.print('*');
                    }
                    break;
                }
                else{
                    System.out.print('#');
                }
            }
            System.out.println();
        }
    }
}
