package Abstraction2;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        // Calls Car's implementation
        car.start();

        // Calls overridden version in Car
        car.stop();

        // Static method belongs to interface
        System.out.println(Vehicle.getVehicleType());
    }
}
