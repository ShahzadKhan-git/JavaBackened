package MultiThreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class BankAccountLocks {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw");
        try {

            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                try {
                    if (balance >= amount) {
                        System.out.println(Thread.currentThread().getName() + " processing withdrawal...");
                        Thread.sleep(3000); // Simulate processing delay
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining Balance: " + balance);
                    } else {
                        System.out.println(Thread.currentThread().getName() + " insufficient balance.");
                    }
                } catch (Exception e){
                    Thread.currentThread().interrupt();
                }
                finally {
                    lock.unlock();
                    System.out.println(Thread.currentThread().getName() + " released the lock");
                }
            } else {
                System.out.println(Thread.currentThread().getName() + " couldn't acquire the lock, will try later");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        BankAccountLocks sbi = new BankAccountLocks();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(20);
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.start();
    }
}
