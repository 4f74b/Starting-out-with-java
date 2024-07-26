public class DemoLoShuMagic {
    public static void main(String[] args) {
        int[][] arr= {{4,9,2},{3,5,7},{8,1,6}};
        LoShuMagic ls= new LoShuMagic();
        boolean isLoShu= ls.check(arr);
        if(isLoShu){
            System.out.println("The array is lo Shu");
        }
        else{
            System.out.println("Not Lo Shu");
        }
    }
}
