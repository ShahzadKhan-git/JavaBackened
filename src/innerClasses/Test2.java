package innerClasses;

public class Test2 {
    public static void main(String[] args) {
        Computer comp = new Computer("Macbook","M2","MacOs");
        comp.getOs().displayInfo();

        Computer.USB usb = new Computer.USB("TYPE-C");

    }
}
