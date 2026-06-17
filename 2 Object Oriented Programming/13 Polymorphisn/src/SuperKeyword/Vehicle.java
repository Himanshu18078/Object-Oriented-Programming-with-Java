package SuperKeyword;

public abstract class Vehicle {
    private int noOfTiers;
    Vehicle(){
        this.noOfTiers = 0;
    }
    Vehicle(int noOfTiers){
        this.noOfTiers = noOfTiers;
    }
    public int getNoOfTiers(){
        return this.noOfTiers;
    }
    public abstract void start();
}
