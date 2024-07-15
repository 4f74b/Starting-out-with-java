import java.io.PrintWriter;
import java.io.IOException;
public class ArrayItemsToFile{
    private int[] array;
    private PrintWriter file;

    public ArrayItemsToFile(int[] arr,PrintWriter f){
        array= arr;
        file=f;
    }

    public ArrayItemsToFile(){
        array=null;
        file=null;
    }

    public boolean addItemsToFile() throws IOException
    {
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
            file.println(array[i]);
        }
        file.close();
        return true;
    }
}