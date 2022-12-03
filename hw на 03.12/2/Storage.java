public class Storage {
    int something;
    int limit;

    Storage(int something, int limit) {
        this.limit = limit;
        if (something > limit) {
            this.something = limit;
        } else {
            this.something = something;
        }
    }

    public synchronized void get() {
        if (this.something > 0) {
            something--;
            System.out.println("Что-то ПОТРЕБЛЕНО, количество: " + this.something);
            notify();

        } else {
            System.out.println("Хранилище пустое");
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
    }
    public synchronized void put() {
            if (this.something < limit) {
                something++;
                System.out.println("Что-то ДОБАВЛЕНО, количество: " + this.something);
                notify();
            } else {
                System.out.println("Хранилище заполнено");
                try {
                    wait();
                } catch (InterruptedException e) {

                }
            }
        }
    }


