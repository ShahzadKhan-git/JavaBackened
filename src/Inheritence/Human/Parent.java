package Inheritence.Human;

public class Parent extends GrandParents {

    public Parent(int age, String name){
        super(age,name );
        System.out.println("Parent Constructor called");
    }

    public void parentMethod(){
        System.out.println("Parent Method called");
    }
}
