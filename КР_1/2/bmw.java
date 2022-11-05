public class bmw extends Car{
    String model;
    int fuelConsumption;

    public bmw(String color, int maxSpeed, String transmission, int price) {
        super(color, maxSpeed, transmission, price);
        this.model = "BMW";
        this.fuelConsumption = 2;
    }
    public bmw(String color, int maxSpeed, String transmission, int price, String model) {
        super(color, maxSpeed, transmission, price);
        this.model = "BMW " + model;
        this.fuelConsumption = 4;
    }
    public bmw(String color, int maxSpeed, String transmission, int price, String model, int fuelConsumption) {
        super(color, maxSpeed, transmission, price);
        this.model = "BMW " + model;
        this.fuelConsumption = fuelConsumption;
    }
    @Override
    public String getModel(){
        return this.model;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
