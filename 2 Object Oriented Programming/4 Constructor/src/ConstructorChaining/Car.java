package ConstructorChaining;
public class Car {
    int noOfWheel;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeat;
    //    CONSTRUCTOR CHAINING
    public Car(String color){
        this.color = color;
        maxSpeed = 150;
        noOfWheel = 5;
        currentFuelInLiters = 2;
        noOfSeat = 5;
    }
    Car(){
//        This is another use of this keyword (Calling current class constructor)
        this("Black"); //This must be the first statement
        currentFuelInLiters = 5;
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