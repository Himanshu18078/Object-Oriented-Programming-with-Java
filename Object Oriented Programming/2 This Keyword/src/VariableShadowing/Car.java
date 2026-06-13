package VariableShadowing;
/*
 When a method parameter or local variable has the same name as an instance variable,
 this situation is called:
👉 Variable Shadowing
(or Shadowing for short)
Because the local variable shadows (hides) the instance variable
*/



public class Car {
    int noOfWheel;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeat;
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
//    This is second use case
    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters +=currentFuelInLiters;
    }
    public float getCurrentFuelInLiters(){
        return currentFuelInLiters;
    }
}
