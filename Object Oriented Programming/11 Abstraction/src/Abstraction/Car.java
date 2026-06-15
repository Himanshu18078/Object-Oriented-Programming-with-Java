package Abstraction;

public class Car extends Vehicle{
    private int noOfDoors;
//    If there is no no-argument constructor in the parent class then we have to define it in the child class too;
    public Car() {
        super(4); // this is similar to constructor chaining that we have studied when we were
        // studying this keyword. and here super used is used instead of this as we have to call the parent constructor.
    }
    @Override
    public void makeStartSound() {
        System.out.println("Bhruuuuuuummmmm....");
    }
}
