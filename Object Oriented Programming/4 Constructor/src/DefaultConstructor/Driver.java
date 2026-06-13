package DefaultConstructor;

public class Driver {
    public static void main() {
        Car myCar = new Car();
        myCar.start();
        myCar.drive();
        System.out.println(myCar.color);
    }
}
