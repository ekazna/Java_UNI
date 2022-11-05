import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Green", 100, "Mech", 10000);
        /*
        car1.accelerate(10);
        car1.accelerate(-10);
        car1.stop();
        car1.start();
        car1.accelerate(110);
        car1.accelerate(-150);*/
        Audi car2 = new Audi("Blue", 150, "Auto", 25000, "A1");
        Ford car3 = new Ford("Red", 200, "Mech", 30000);
        bmw car4 = new bmw("Black", 250, "Auto", 58220, "X6");
        bmw car5 = new bmw("White", 220, "Auto", 48520, "M5");
        bmw car6 = new bmw("Blue", 220, "Auto", 48520, "M5");

        /*
        car2.start();
        car2.setCurrentSpeed(200);
        System.out.println(car2.getColor());
        */

        Garage garage1 = new Garage(6);
        garage1.addCar(car1);
        garage1.addCar(car2);
        garage1.addCar(car3);
        garage1.addCar(car4);
        garage1.addCar(car5);
        garage1.addCar(car6);
        garage1.printGarage();
        // Не успела доделать сортировку по количеству
    }
}