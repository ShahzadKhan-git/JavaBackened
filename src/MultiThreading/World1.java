package MultiThreading;

public class World1 extends Thread{
    //Method to create a thread
    @Override
    //RUNNING
    public void run(){
        //For infinite loop
        for(; ;){
            System.out.println("World");
        }
    }

    //Thread Lifecycle
    // New -> Runnable -> Running -> Blocked/Waiting -> Terminated
    //Java mein Running state nhi hota

    public static void main(String[] args) {
        World1 world = new World1(); //NEW
        world.start();
        //Start method is called to initiate the new thread
        //RUNNABLE state

        for(; ;){
            System.out.println("Hello");
        }

    }

}
