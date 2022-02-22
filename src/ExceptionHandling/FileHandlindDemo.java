package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileHandlindDemo {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("D:\\amol1.txt");

        System.out.println("file read");
        System.out.println("End of the program");
    }
}
