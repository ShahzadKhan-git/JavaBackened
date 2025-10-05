package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwKeyword {
    public static void main(String[] args) throws FileNotFoundException {
      method1();
    }

    public static void method1() throws FileNotFoundException {
        try{
            FileReader fileReader = new FileReader("a.txt");
        }catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
            throw new FileNotFoundException("OOPS NOT FOUND");
        }
    }
}
