package Exceptions;

public class customException {
    //Bank Account
    private double balance;

    public customException(double amount){
        this.balance = amount;
    }

    public void withdraw(double amount) throws Exception {
        if(amount > balance){
            throw new InsufficientFundsException();
        }
        else{
            balance -= amount;
        }
    }

    public static void main(String[] args) {
        customException cE = new customException(100);
        try{
            cE.withdraw(110);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
