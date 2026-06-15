package Abstraction;

public abstract class Vehicle implements Transport {
    private int noOfTires;
//    Transport interface have abstract method getSetGo() and we didn't give its definition here, but it
//    will not give any error as the Vehicle is abstract class itself, and it passes it's responsibility to its
//    child class.But we can define it here also.
    public void getSetGo(){
        System.out.println("going to somewhere...");
    }
    public Vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }
//    This is abstract Method :- it don't have body just implementation
    public abstract void makeStartSound();

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }
    public void commute(){
        System.out.println("Going");
    }
}
