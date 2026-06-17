package Inheritance;

public class Vehicle {
    protected int noOfTiers;
    public void setNoOfTiers(int noOfTiers){
        this.noOfTiers = noOfTiers;
    }
    public void commute(){
        System.out.printf("I am going from place a to place b using %d number of tiers\n",noOfTiers);
    }
}
