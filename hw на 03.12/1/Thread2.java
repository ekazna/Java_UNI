class Thread2 extends Thread {
    Object lock;

    Thread2(String name, Object lock) {
        super(name);
        this.lock = lock;
        start();
    }

    public void run() {
        while (true) {
            synchronized (lock) {
                try {
                    System.out.println(getName());
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}