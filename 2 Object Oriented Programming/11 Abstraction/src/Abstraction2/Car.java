package Abstraction2;

class Car implements Vehicle {

    // Required because start() is abstract
    @Override
    public void start() {
        System.out.println("Car started");
    }

    // Optional override of default method
    @Override
    public void stop() {
        System.out.println("Car stopped using brakes");
    }
}