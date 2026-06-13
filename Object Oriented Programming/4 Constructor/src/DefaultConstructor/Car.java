package DefaultConstructor;

public class Car {
    int noOfWheel;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeat;
//    CONSTRUCTOR
    public Car(){
        color = "Black";
        maxSpeed = 150;
        noOfWheel = 5;
        currentFuelInLiters = 2;
        noOfSeat = 5;
    }
    public Car start(){
        if(currentFuelInLiters == 0){
            System.out.println("Car is out of fuel, Can't Start ");
        }
        else if(currentFuelInLiters < 5){
            System.out.println("Car is in reserve mode, Please refuel");

        }else{
            System.out.println("Car is started ... bhruuuuuuhh ");
        }
        return this;
    }
    public void drive(){
        currentFuelInLiters--;
        System.out.println("Car is Driving");
    }
    //    This is second use case
    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters +=currentFuelInLiters;
    }
    public float getCurrentFuelInLiters(){
        return currentFuelInLiters;
    }
}
