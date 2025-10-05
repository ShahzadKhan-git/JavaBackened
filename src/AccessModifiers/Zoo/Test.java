package AccessModifiers.Zoo;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob");
        dog.setDogSound("woof");
        dog.makeSound();
        dog.wagTail();
    }
}
