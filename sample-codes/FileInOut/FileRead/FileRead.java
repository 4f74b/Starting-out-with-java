import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws IOException
    {
        File file = new File("demo.txt");

        Scanner fileInput = new Scanner(file);

        while (fileInput.hasNext()){
            System.out.println(fileInput.nextLine());
        }

        fileInput.close();
    }
}
