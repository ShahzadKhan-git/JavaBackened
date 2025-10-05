package Inheritence.Animals;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("Tommy");
        d.setAge(10);
        d.eat();
        d.sayHello();
        System.out.println(d.getName());
        System.out.println(d.getAge());

        Animal dog = new Dog(); //Yaha pe reference animal ka h toh iska mtlb jo jo animal mein method h wahi call kara shakte h sirf
        dog.sayHello();

    }
}
