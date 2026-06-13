package MethodChaining;

public class Car {

    //    The following are instance variable of the class+
    int noOfWheel;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeat;
    /*
    ✅ Use Case: Method Chaining (Fluent Interface Pattern)
        Returning this is used in a design style called:
        ➡️ Fluent Interface Pattern
        or
        ➡️ Method Chaining
         It means you can call multiple methods on the same object in one continuous chain.
     */
    public Car start(){
        if(currentFuelInLiters == 0){
            System.out.println("MethodChaining.Car is out of fuel, Can't Start ");
        }
        else if(currentFuelInLiters < 5){
            System.out.println("MethodChaining.Car is in reserve mode, Please refuel");

        }else{
            System.out.println("MethodChaining.Car is started ... bhruuuuuuhh ");
        }
        return this;
    }
    public void drive(){
        currentFuelInLiters--;
        System.out.println("MethodChaining.Car is Driving");
    }
    public void addFuel(float fuel){
        currentFuelInLiters +=fuel;
    }
    public float getCurrentFuelInLiters(){
        return currentFuelInLiters;
    }
}
