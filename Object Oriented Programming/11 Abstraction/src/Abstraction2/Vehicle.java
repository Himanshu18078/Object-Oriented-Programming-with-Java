package Abstraction2;

/*
 * Interface can contain:
 * 1. abstract methods      -> must be implemented by child classes
 * 2. default methods       -> already have implementation, child may override
 * 3. static methods        -> belong to the interface itself
 * 4. private methods       -> helper methods used only inside the interface
 */

interface Vehicle {

    // Abstract method
    // Any class implementing Vehicle MUST provide an implementation.
    void start();

    // Default method
    // Child classes automatically inherit this implementation.
    // They can override it if they want different behavior.
    default void stop() {
        log("Vehicle stopped");
    }

    // Static method
    // Belongs to the interface itself, not to objects.
    // Called using Vehicle.getVehicleType()
    static String getVehicleType() {
        return "General Vehicle";
    }

    // Private method
    // Only code INSIDE this interface can use it.
    // Child classes cannot access or override it.
    private void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
