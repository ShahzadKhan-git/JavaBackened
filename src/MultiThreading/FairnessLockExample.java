package MultiThreading;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class FairnessLockExample {
    private final Lock lock = new ReentrantLock(true);

    public void accessResources(){
        lock.lock();
        try{
            System.out.println(Thread.currentThread().getName() + " acquired the lock");
            Thread.sleep(1000);
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() + " released the lock");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        FairnessLockExample exp = new FairnessLockExample();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                exp.accessResources();
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");
        Thread t3 = new Thread(task, "Thread-3");
        t1.start();
        t2.start();
        t3.start();

    }

}
