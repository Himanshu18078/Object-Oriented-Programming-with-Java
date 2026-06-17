public class TestTransportation {
    static void main() {
        Car c = new Car();
        Vehicle v = new Vehicle();
        /*
        We can create a new object of Child class with the reference of parent class
        to understand we can say tha car is a vehicle
        */
        Vehicle cCar = new Car();

        /*
        But we can't create a new object of parent with the help of child reference
        to understand we can say that it is not necessary that every vehicle is a car it could be either plan or
        any other type of vehicle
         */
        Car vCar = (Car) new Vehicle(); // in this case we explicitly have cast it
    }
}
/*
 * A child object can always be stored in a parent reference because
 * every Car is a Vehicle (IS-A relationship).
 *
 * Example:
 * Vehicle vehicle = new Car();   // Valid (Upcasting)
 *
 * However, a parent object cannot be treated as a child object because
 * not every Vehicle is a Car. A Vehicle could be a Bike, Plane, etc.
 *
 * Example:
 * Vehicle vehicle = new Vehicle();
 * Car car = (Car) vehicle;       // Compiles but throws ClassCastException at runtime
 *
 * Downcasting is only safe when the actual object was originally created
 * as the child type.
 *
 * Example:
 * Vehicle vehicle = new Car();
 * Car car = (Car) vehicle;       // Valid
 */