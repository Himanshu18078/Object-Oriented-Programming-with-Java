public class Test {

    public static void castTest(Vehicle veh) {
//        veh.start();

        // Cast Vehicle to Car when we know that 'veh' is actually referring to a Car object.
        // This allows us to access Car-specific methods.
        Car cVehicle = (Car) veh;
        System.out.println(cVehicle.numberOfDoors());
    }

    static void main() {

        Vehicle v = new Vehicle();
        Car c = new Car();
        Plane p = new Plane();

        // Passing a Vehicle object.
        // The parameter type is Vehicle, so this matches directly.
//        castTest(v);

        // Passing a Car object.
        // Car extends Vehicle, so Java automatically upcasts the Car object to a Vehicle reference when passing it.
        castTest(c);

        // Passing a Plane object.
        // Plane also extends Vehicle, so Java automatically upcasts the Plane object to a Vehicle reference when passing it.
//        castTest(p);
    }
}