package Exceptions;

public class finallyKeyword {
    public static void main(String[] args) {
        System.out.println(divide());
    }

    public static int divide(int a, int b){
        try{
            return a/b;
        }catch(Exception e){
            System.out.println(e);
            return -1;
        }finally{  //Chhahe try chale ya catch chale , Finally hamesha chalna hi h
            System.out.println("Bye");
        }
    }
}
