import java.util.*;

public class Garage {
    public int maxCapacity;
    private int currentCapacity;
    private ArrayList<Car> garageCars;
    private HashMap<String, Integer> quantities = new HashMap<>();

    public Garage(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.currentCapacity = 0;
        this.garageCars = new ArrayList<Car>();
    }
    public Garage(int maxCapacity, ArrayList<Car> garageCars){
        this.maxCapacity = maxCapacity;
        this.currentCapacity = garageCars.toArray().length;
        this.garageCars = garageCars;
        if (this.maxCapacity < currentCapacity){
            int excess = this.currentCapacity - this.maxCapacity;
            System.out.println("В гараже недостаточно места. Добавлено машин: " +this.maxCapacity + ". Не добавлено машин: "+ excess);
            for (int i = this.maxCapacity; i < this.currentCapacity;) {
                this.garageCars.remove(i);
                this.currentCapacity -=1;
            }
            this.currentCapacity = maxCapacity;
        }
        for (Car car: this.garageCars) {
            if (this.quantities.containsKey(car.getModel())){
                this.quantities.put(car.getModel(), this.quantities.get(car.getModel())+1);
            } else {
                this.quantities.put(car.getModel(), 1);
            }
        }

    }

    public void addCar(Car car){
        if (this.currentCapacity < this.maxCapacity) {
            this.garageCars.add(car);
            System.out.println("Машина добавлена в гараж");
            this.currentCapacity += 1;
            if (this.quantities.containsKey(car.getModel())){
                this.quantities.put(car.getModel(), this.quantities.get(car.getModel())+1);
            } else {
                this.quantities.put(car.getModel(), 1);
            }

        } else {
            System.out.println("Гараж полон, невозможно добавить машину");
        }
    }

    // Не успела доделать сортировку по количеству
    public void printGarage(){
        HashSet<String> setCars = new HashSet<String>();
        for (Car car: this.garageCars) {
            String model = car.getModel();
            setCars.add(model);
        }
        ArrayList<Car> tempListOfCars = new ArrayList<Car>();
        for (String model:setCars) {
            for (Car car: this.garageCars) {
                if (model.equals(car.getModel())){
                    tempListOfCars.add(car);
                    break;
                }
            }
        }
        tempListOfCars.sort(new Comparator<Car>() {
            public int compare(Car c1, Car c2) {
                return c1.getPrice().compareTo(c2.getPrice());
            }
        });
        for (Car car:tempListOfCars) {
            System.out.println(this.quantities.get(car.getModel()) + " " + car.getModel());
        }
    }


}
