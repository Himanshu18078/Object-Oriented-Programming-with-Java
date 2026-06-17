public class Car {
    static int noOfCarSold;
    int noOfWheel;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeat;
    static{
        noOfCarSold = 0;
        System.out.println("I am in static block");
    }
    {
        noOfCarSold ++;
        System.out.println("I am in init block");
    }
    //    CONSTRUCTOR
    public Car(String color){
        this.color = color;
        maxSpeed = 150;
        noOfWheel = 5;
        currentFuelInLiters = 2;
        noOfSeat = 5;
    }
    public Car(){
        this("Black");
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
/*
| Step | Event       | What Runs                            | `noOfCarSold` Value |
| ---- | ----------- | ------------------------------------ | ------------------- |
| 1    | Class loads | **static block** (`noOfCarSold = 0`) | 0                   |
| 2    | Create obj1 | **instance block** (`noOfCarSold++`) | 1                   |
| 3    |             | **constructor**                      | 1                   |
| 4    | Create obj2 | **instance block** (`noOfCarSold++`) | 2                   |
| 5    |             | **constructor**                      | 2                   |
| 6    | Create obj3 | **instance block** (`noOfCarSold++`) | 3                   |
| 7    |             | **constructor**                      | 3                   |

*/