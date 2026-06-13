public class Car {

//    The following are instance variable of the class+
    int noOfWheel;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeat;

//    The following are the instance method of the class
    public void drive(){
        if(currentFuelInLiters == 0){
            System.out.println("Car is out of fuel");
        }else if(currentFuelInLiters < 5){
            System.out.println("Car is in reserve mode, Please refuel");
            currentFuelInLiters--;
        }else{
            System.out.println("Car is driving");
            currentFuelInLiters--;
        }
    }
    public void addFuel(float fuel){
        currentFuelInLiters +=fuel;
    }
    public float getCurrentFuelInLiters(){
        return currentFuelInLiters;
    }
}
