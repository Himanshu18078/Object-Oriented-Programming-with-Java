package MethodChaining;

public class Driver {
    public static void main(String [] args) {
        Car swift = new Car();
        swift.addFuel(6);
        swift.start().drive(); // This is call method chaining
//        “I created a swift object and added fuel to it.
//        When I call start(), the method returns the same MethodChaining.Car object (using return this).
//        This returned reference can be treated like a new variable that points to the same object,
//        allowing me to immediately call other methods like drive() on it. That is why method chaining works.”
    }
}
