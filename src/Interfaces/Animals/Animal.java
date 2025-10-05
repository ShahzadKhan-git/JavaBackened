package Interfaces.Animals;

public interface Animal {

    int MAX_AGE = 150;

    void eat(); //Here we don't have to write public abstract as in interface it is already present

    void sleep();

    public static void info(){
        System.out.println("This is an Animal Interface");
    }

    public default void run(){
        this.eat();
        System.out.println("Animal is Running");
    }
}
