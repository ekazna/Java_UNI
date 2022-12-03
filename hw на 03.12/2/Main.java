public class Main {

    public static void main(String[] args) {

        Storage storage = new Storage(3, 5);
        Manufacturer man = new Manufacturer(storage);
        Consumer con = new Consumer(storage);

        new Thread(man).start();
        new Thread(con).start();
    }
}

