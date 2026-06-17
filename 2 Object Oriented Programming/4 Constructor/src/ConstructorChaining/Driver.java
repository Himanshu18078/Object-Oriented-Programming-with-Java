package ConstructorChaining;

public class Driver {
    public static void main(String [] args){
        Car myCar = new Car("Orange");
        Car Thar = new Car();
        System.out.println(Thar.color);
    }
}
