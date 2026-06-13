public class Driver {
    static void main() {
//        This is how we declare object in the java
        Car myCar = new Car();
        myCar.addFuel(6);
        myCar.drive();
        System.out.println(myCar.getCurrentFuelInLiters());
        myCar.drive();
        System.out.println(myCar.getCurrentFuelInLiters());
        myCar.drive();
        System.out.println(myCar.getCurrentFuelInLiters());
    }
}
