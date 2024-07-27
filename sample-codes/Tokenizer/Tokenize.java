import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Tokenize{
    public static ArrayList t(File f) throws IOException{
        Scanner file= new Scanner(f);
        String line;
        ArrayList arr= new ArrayList<>();
        double total;
        while (file.hasNextLine()){
            total=0;
            line=file.nextLine();
            String[] marks=line.split(",");
            for (int i=0; i<marks.length; i++){
                total+=Integer.parseInt(marks[i]);
            }
            arr.add(total/marks.length);

        }
        file.close();
        return arr;
    }
}