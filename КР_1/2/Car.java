public class Car {
    private String color;
    private int maxSpeed;
    private String transmission;
    private Integer price;
    private int currentSpeed;
    private boolean started;


    public Car(String color, int maxSpeed, String transmission, int price) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
        this.price = price;
        this.currentSpeed = 0;

    }

    public void start(){
        this.started = true;
    }
    public void stop() {
        this.currentSpeed = 0;
        this.started = false;
    }
    public void accelerate(int speed){
        if (this.currentSpeed + speed >= 0){
            if (this.started && this.currentSpeed + speed <= this.maxSpeed){
                this.currentSpeed += speed;
                System.out.println("Машина ускорилась на " + speed);
            } else if (this.started){
                System.out.println("Ускорение на " + speed + " невозможно");
                System.out.println("Машина ускорилась на " + (this.maxSpeed-this.currentSpeed) + " и достигла максмальной скорости");
                this.currentSpeed = maxSpeed;
            } else {
                System.out.println("Машина не заведена");
            }
        } else {
            if (this.started){
                System.out.println("Скорость не может опуститься ниже 0");
                System.out.println("Машина остановилась");
                this.currentSpeed = 0;
            } else {
                System.out.println("Машина не заведена");
            }
        }

    }
    public String getModel(){
        return "None";
    }
    public String getColor(){
        return color;
    }
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public Integer getPrice() {
        return price;
    }
    public String getTransmission() {
        return transmission;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setCurrentSpeed(int currentSpeed) {
        if (currentSpeed <= this.maxSpeed){
            this.currentSpeed = currentSpeed;
        } else {
            System.out.println("Невозможно изменить скорость т.к. она превышает максимальную");
        }
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        if (this.currentSpeed > this.maxSpeed) {
            this.currentSpeed = this.maxSpeed;
        }
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}
