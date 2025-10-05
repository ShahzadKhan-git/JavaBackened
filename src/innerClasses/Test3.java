package innerClasses;

public class Test3 {
    public static void main(String[] args) {
        ShoppingCart scart = new ShoppingCart(1090);
        //anonymous inner  class
        ShoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " using Credit Card."); //We can directly make override here without making the class credit card
            }
        });

        ShoppingCart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " using PhonePay.");
            }
        });
    }
}
