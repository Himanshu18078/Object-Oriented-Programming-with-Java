package Package1;

public class AccessTest {
    public static void main(String [] args){
        Car car = new Car();
        car.color = "White";
        car.model = "HB04";
        car.costOfPurchase = 500;// here costOfPurchase is accessible because it is package private(default).
        System.out.println(car);
//      car.costOfPurchase = 4656465;'costOfPurchase' has private access in 'Package1.Car'
        Car BMW = new Car("Black","BMW",5,50000000);
        System.out.println(BMW);
    }
}
