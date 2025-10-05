package Exceptions;

import java.util.Arrays;

public class stackTrace {
    public static void main(String[] args) {
        try{
            level1();
        }catch(Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

    }

    public static void level3(){
      int[] arr = new int[5];
      arr[5] = 10;
    }
    public static void level2(){
        level3();
    }
    public static void level1(){
        level2();
    }
}
