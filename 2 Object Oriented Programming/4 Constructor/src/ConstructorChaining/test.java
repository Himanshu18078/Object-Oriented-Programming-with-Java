package ConstructorChaining;

public class test {
    static void main() {
        Car c1 = new Car("Yellow");
        System.out.println(c1.color);
        Car c2 = new Car();
        System.out.println(c2.color);
    }

}
