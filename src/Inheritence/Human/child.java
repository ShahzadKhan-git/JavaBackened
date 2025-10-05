package Inheritence.Human;

public class child extends Parent {

    public child(int age, String name){
        super(age,name);
        System.out.println("Child constructor called");
    }

    public void childMethod(){
        System.out.println("child method called");
        super.parentMethod();
    }
}
