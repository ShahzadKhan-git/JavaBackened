package Exceptions;

public class division {
    public static void main(String[] args) {
        int[] num = {20,30,40,50};
        int[] den = {2,3,0,5};
        for(int i=0; i<6; i++){
            try{
                System.out.println(divide(num[i],den[i]));
            }catch(Exception e){
                System.out.println(e);
            }
        }
        System.out.println("Good :)");
    }

    public static int divide(int a, int b){
        try{
            return a/b;
        }catch (ArithmeticException e){
            System.out.println(e);
            return -1;
        }catch (Exception e){ //Multiple catch block can be used in a program
            System.out.println(e);
            return -1;
        }
    }
}
