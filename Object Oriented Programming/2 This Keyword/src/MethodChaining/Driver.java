public class Driver {
    public static void main(String[] args) {
        Car swift = new Car();
        swift.addFuel(6);

        swift.start().drive(); // Method chaining
        /*
         * The start() method returns 'this', which is a reference to the
         * current object. The returned reference points to the same Car
         * object in memory as 'swift'.
         *
         * Since the returned reference is of type Car, we can immediately
         * call another method such as drive() on it.
         *
         * This is why method chaining works:
         * swift.start().drive();
         *
         * A Java reference variable does not store the object's data (fields).
         * It stores only a reference to the object.
         */
    }
}