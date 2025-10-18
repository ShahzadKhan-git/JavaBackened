package MultiThreading;

public class Counter {
    private int count=0;

    public synchronized void increment(){ //synchronized keyword means agar 1 thread chal rha ho toh dusra wait kare
        count++;
    }

    public int getCount() {
        return count;
    }
}
