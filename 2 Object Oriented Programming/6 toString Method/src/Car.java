public class Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String [] args){
        Car swift = new Car(4,4,120,"Swift",
                "HB04","Maruti");
//        System.out.println(swift.toString());
        // if we don't define the tostring method it will print className@hashcode Car@27716f4.
        // We can define our own to string method.
        System.out.println(swift); // we don't have to add toString method it is implicit.
        // We just have to print the object, and it will get printed y itself.
    }
}
