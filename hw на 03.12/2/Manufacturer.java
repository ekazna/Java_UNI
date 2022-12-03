import static java.lang.Thread.sleep;

public class Manufacturer implements Runnable{

    Storage storage;
    Manufacturer(Storage storage){
        this.storage = storage;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            storage.put();
        }
    }
}
