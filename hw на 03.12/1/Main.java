public class Main {

    public static void main(String[] args) {
        Object lock = new Object();
        Thread2 thread1 = new Thread2("Thread 1", lock);
        Thread2 thread2 = new Thread2("Thread 2", lock);

    }

}

