import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
public class DemoArrayItemsToFile{
    public static void main(String[] args) throws IOException
    {
        int[] array= {42,4,23,12,5,1};
        PrintWriter file= new PrintWriter("array-file.txt");

        ArrayItemsToFile arrayWrite= new ArrayItemsToFile(array, file);

        arrayWrite.addItemsToFile();
    }
}