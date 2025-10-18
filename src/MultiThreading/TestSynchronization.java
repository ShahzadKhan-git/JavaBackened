package MultiThreading;

public class TestSynchronization {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadSynchronization t1 = new ThreadSynchronization(counter);
        ThreadSynchronization t2 = new ThreadSynchronization(counter);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println(counter.getCount());
    }
}
