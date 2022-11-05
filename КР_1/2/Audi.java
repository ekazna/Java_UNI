public class Audi extends Car{
    String model;
    int accSpeed;

    public Audi(String color, int maxSpeed, String transmission, int price) {
        super(color, maxSpeed, transmission, price);
        this.model = "Audi";
        this.accSpeed = 7;
    }
    public Audi(String color, int maxSpeed, String transmission, int price, String model) {
        super(color, maxSpeed, transmission, price);
        this.model = "Audi " + model;
        this.accSpeed = 7;
    }

    public Audi(String color, int maxSpeed, String transmission, int price, String model, int accSpeed) {
        super(color, maxSpeed, transmission, price);
        this.model = "Audi " + model;
        this.accSpeed = accSpeed;
    }

    @Override
    public String getModel(){
        return this.model;
    }

    public int getAccSpeed() {
        return accSpeed;
    }
}
