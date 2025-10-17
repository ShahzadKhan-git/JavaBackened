package MultiThreading;

public class World2 implements Runnable{
    //Another method to create a thread

    @Override
    public void run() {
        System.out.println("World");

    }

    public static void main(String[] args) {
        World2 world2 = new World2();
        Thread t1 = new Thread(world2); //We have to create a new thread in this implement method
        t1.start();

        for(; ;){
            System.out.println("Hello");
        }
    }
    //Runnable method is used when you have to extend the other classes than Thread
    //class A extends B , Thread (Not acceptable in java)
    //Class A extends B implements Runnable (This is best to use when class is extending other class)
}
