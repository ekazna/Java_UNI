import static java.lang.Thread.sleep;

public class Consumer implements Runnable {

    Storage storage;
    Consumer(Storage storage){
        this.storage = storage;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            storage.get();
        }
    }
}
