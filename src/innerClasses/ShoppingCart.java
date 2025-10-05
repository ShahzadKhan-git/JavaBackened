package innerClasses;

public class ShoppingCart {
    private static double totalAmt;

    public ShoppingCart(double totalAmt){
        this.totalAmt = totalAmt;
    }

    public static void processPayment(Payment paymentMethod){
        paymentMethod.pay(totalAmt);
    }
}
