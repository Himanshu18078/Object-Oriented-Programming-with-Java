package Package2;

import Package1.Car;

public class DefaultTest {
    public static void main(String [] args){
        Car car = new Car("Yellow","Urus",5,50000000);
        car.model = "Lamborghini";
        car.color = "Black";
//      We can't access costOfPurchase because it is default
//      which means only accessible in the same package classes
    }
}
