package getterSetter;

public class Car {
    private String color;
    private String model;
    private double fuelLeve;
    private long costOfPurchase;

    Car(String color, String model, double fuelLeve, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLeve = fuelLeve;
        this.costOfPurchase = costOfPurchase;
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

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public double getFuelLeve() {
        return fuelLeve;
    }

    public long getCostOfPurchase() {
        return costOfPurchase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelLeve(double fuelLeve) {
        this.fuelLeve = fuelLeve;
    }

}
