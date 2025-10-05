package encapsulation;

public class Test2 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(1100);
        ba.withdraw(123);
        ba.deposit(-1);
        ba.withdraw(12);

        System.out.println(ba.getBalance());
    }
}
