package Abstraction;

public class TestAbstraction {
    static void main() {
//        Vehicle veh = new Vehicle(); //'Vehicle' is abstract; cannot be instantiated
        Car car =new Car();
        car.commute();
        car.makeStartSound();
    }
}
