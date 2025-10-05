package encapsulation;

public class BankAccount {
    private long accountnum;

    private double balance;

    public void deposit(int amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposited : " + amount);
        }
        else{
            System.out.println("Invalid Deposit");
        }
    }

    public void withdraw(int amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println("Withdrawl : " + amount);
        }
        else{
            System.out.println("Invalid withdrawl");
        }
    }

    public long getAccountnum() {
        return accountnum;
    }

    public void setAccountnum(long accountnum) {
        this.accountnum = accountnum;
    }

    public double getBalance() {
        return balance;
    }

}
