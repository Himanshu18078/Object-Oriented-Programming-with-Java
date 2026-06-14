package Package1;

public class Car {
    public String color;
    public String model;
    private double fuelLeve;
    long costOfPurchase;

    public Car(String color, String model, double fuelLeve, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLeve = fuelLeve;
        this.costOfPurchase = costOfPurchase;
    }
    public Car(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", fuelLeve=").append(fuelLeve);
        sb.append(", costOfPurchase=").append(costOfPurchase);
        sb.append('}');
        return sb.toString();
    }
}
