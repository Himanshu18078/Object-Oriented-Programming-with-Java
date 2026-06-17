package getterSetter;

public class GetterTest {
    public static void main(String [] args){
        Car car = new Car("Black","HB04",5,50000);
        System.out.println(car);
        System.out.printf("%S %S",car.getColor(),car.getModel());
    }
}
