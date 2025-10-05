package Interfaces.Animals;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();

        System.out.println(Dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE);

        Animal.info();
        //Yha pe hum Dog.info() nhi kar shakte kyunki ye kaam nhi karega as static declared h Animal class mein

        dog.run();
        cat.run(); //Yaha hmm interface ke implements class ke through access kar paate h due to default class declaration
    }
}
