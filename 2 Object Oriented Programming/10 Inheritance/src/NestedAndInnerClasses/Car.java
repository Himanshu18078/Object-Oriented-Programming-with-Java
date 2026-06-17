package NestedAndInnerClasses;
//Outer class can be private and default only
public class Car {
    public void repair(){
        Tire t = new Tire();
    }
//    Inner class can be private protected default and public
    private static class Tire{
        private double width;
        private double pressure;
        private String material;
    }
}
