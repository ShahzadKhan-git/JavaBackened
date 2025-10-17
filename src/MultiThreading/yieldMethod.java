package MultiThreading;

public class yieldMethod extends Thread {

    //This helps to give name to the thread
    public yieldMethod(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i=0; i<5 ; i++){
            System.out.println(Thread.currentThread().getName() + " is Running");
            Thread.yield(); //This gives hint to jvm to run multiple threads
        }
    }

    public static void main(String[] args) throws InterruptedException  {
        yieldMethod t1 = new yieldMethod("thread1");
        yieldMethod t2 = new yieldMethod("thread2");
        t1.start();
        t2.start();
    }
}
