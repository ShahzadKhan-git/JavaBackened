package encapsulation;

public class students {
    String name;
    private int age;
    int rollno;

    //Constructor
    public students(String name, int age, int rollno){ //Yaha pe hmm kisi bhi type ka constructor bana shakte h, chhah name jaaye ya roll no first
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }

    public void setAge(int x){
        if(x<0) {
            System.out.println("Invalid Age ");
        }

        this.age = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
}
