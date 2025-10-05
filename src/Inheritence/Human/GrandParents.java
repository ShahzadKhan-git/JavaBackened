package Inheritence.Human;

public class GrandParents {
    private String name;
    private int age;
    private boolean hasSuperPowers;

    public boolean hasSuperPowers(){
        return hasSuperPowers;
    }

    public GrandParents(int age, String name){
        this.name= name;
        this.age = age;
        hasSuperPowers = false;
        System.out.println("Grand Parents Constructor called");
    }
}
