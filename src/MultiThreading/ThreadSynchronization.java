package MultiThreading;

public class ThreadSynchronization extends Thread {
    private Counter counter;

    public ThreadSynchronization(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for(int i=0; i<1000; i++){
            counter.increment();
        }
    }
}
