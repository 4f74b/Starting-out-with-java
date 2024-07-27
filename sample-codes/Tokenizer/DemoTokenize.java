import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DemoTokenize {
    public static void main(String[] args) throws IOException {
        File f=new File("./scores.csv");

        ArrayList arr= Tokenize.t(f);

       for (int i=0; i<arr.size(); i++){
        System.out.println("Average of Student "+(i+1)+" is "+arr.get(i));
       } 
    }
}
