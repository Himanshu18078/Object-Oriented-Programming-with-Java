public class Driver {
    static int minAgeForDriving = 18;
    String name;
    String dateOfLicence;
    int age;

    public boolean isAllowedToDrive(int age){
        return this.age >= minAgeForDriving;
    }
    public static void main() {
        Car myCar = new Car();
        Driver myDriver = new Driver();
        myDriver.dateOfLicence = "1/Jan/2024";
        System.out.println(minAgeForDriving);
    }
}
