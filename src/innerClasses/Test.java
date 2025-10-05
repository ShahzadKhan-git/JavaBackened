package innerClasses;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("BMW");

        Car.Engine engine = car.new Engine();
        engine.start();
        engine.stop();
    }


}
