package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwsKeyword {
    public static void main(String[] args) throws FileNotFoundException{
     method2();
    }

    public static void method1() throws FileNotFoundException {
        FileReader fileReader = new FileReader("name.txt");
    }

    public static void method2() throws FileNotFoundException{
        method1();
    }


}
