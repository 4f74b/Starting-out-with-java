import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws IOException
    {
        String txt;
        boolean stopWriting=false;

        PrintWriter file= new PrintWriter("demo.txt");

        Scanner kb= new Scanner(System.in);

        while (!stopWriting){
            System.out.print("Write a line to add it to the file or Write END and press enter to stop the process:  ");

            txt=kb.nextLine();

            if (txt.equals("END")){
                stopWriting=true;
            }
            else{
                file.println(txt);
            }

        }
        System.out.print("\n\nYour Input is written to the file.\n\n");
        file.close();
    }
}
