package Polymorphism;

//Run time Polymorphism (Method Overriding)

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sayHello();

        Animal dog = new Dog(); //Upcasting (Lower Hierarchy ka object Upper Hieraarchy mein daal rhe ho)
        dog.sayHello();
//        dog.sayBye();  Here we can only call the method which is only defined in Animal Class as Animal instance is used only

        Dog d = new Dog();
        d.sayBye();

        Animal cat = new Cat();
        cat.sayHello();

        Dog myDog = (Dog) d; //Downcasting
    }
}

