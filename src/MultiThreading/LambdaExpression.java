package MultiThreading;

public class LambdaExpression {
    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello");
//            }
//        };

        //Using Lambda Expression -> sirf Bracket rakho and name , return type , sab hata do

        Runnable runnable = () -> {
            System.out.println("Hello");
        };

        Thread t1 = new Thread("runnable");
        t1.start();
    }
}
