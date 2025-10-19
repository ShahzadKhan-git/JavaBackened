package MultiThreading;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class ReentrantExample {
    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try{
            System.out.println("Outer Method");
            innerMethod();
        }finally {
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("Inner Method");
        }finally {
            lock.unlock();
        }
    }
    //Isme kya ho rha ki Outer Method lock hoke inner method call kar rha h aur usme wapas se lock laga hua h , ye possible nhi h lock ke upar lock
    //Reentrant Lock means usme wapas se lock ko access de rhe h

    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        example.outerMethod();
    }
}
