package Inharitance2;

import Inheritance.Vehicle;

public class TwoWheelers extends Vehicle {
//    protected TwoWheelers(){
//        setNoOfTiers(2);
//        noOfTiers = 4;
//    }
    public TwoWheelers(){
        setNoOfTiers(2);
        noOfTiers = 4;
    }
    public void balance(){
        System.out.println("I am balancing on two tires");
    }
}
