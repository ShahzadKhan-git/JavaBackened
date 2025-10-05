package Polymorphism;

//Compile Time Polymorphism (Method Overloading)
public class Calculator {

    public static int add(int a, int b){
        return a+b;
    }

    public static float add(float a, float b){
        return a+b;
    }

    public static double add(double a, double b){
        return a+b;
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(1,2));
        System.out.println(calc.add(1.2,3.4));


    }
}
