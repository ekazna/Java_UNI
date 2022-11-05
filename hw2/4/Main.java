import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> arrayList1 = new ArrayList<>();
        LinkedList<Object> linkedList1 = new LinkedList<>();

        long start1 = System.currentTimeMillis();

        addArrayList(arrayList1);

        long finish1 = System.currentTimeMillis();
        long elapsed1 = finish1 - start1;
        System.out.println("Заполнение ArrayList: " + elapsed1);


        long start2 = System.currentTimeMillis();

        addArrayList(linkedList1);

        long finish2 = System.currentTimeMillis();
        long elapsed2 = finish2 - start2;
        System.out.println("Заполнение LinkedList: " + elapsed2);


        long start3 = System.currentTimeMillis();

        chooseArrayList(arrayList1);

        long finish3 = System.currentTimeMillis();
        long elapsed3 = finish3 - start3;
        System.out.println("Выбор из ArrayList: " + elapsed3);


        long start4 = System.currentTimeMillis();

        chooseArrayList(linkedList1);

        long finish4 = System.currentTimeMillis();
        long elapsed4 = finish4 - start4;
        System.out.println("Выбор из LinkedList: " + elapsed4);

    }

    public static ArrayList<Object> addArrayList(ArrayList<Object> list){
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            list.add(random.nextInt());
        }
        return list;
    }
    public static LinkedList<Object> addArrayList(LinkedList<Object> list){
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            list.add(random.nextInt());
        }
        return list;
    }

    public static ArrayList<Object> chooseArrayList(ArrayList<Object> list){
        int max = list.toArray().length - 1;
        for (int i = 0; i < 10000; i++) {
            int randInt = (int) Math.floor(Math.random() * (max) + 0);
            Object chosen = list.get(randInt);
        }
        return list;
    }
    public static LinkedList<Object> chooseArrayList(LinkedList<Object> list){
        int max = list.toArray().length - 1;
        for (int i = 0; i < 10000; i++) {
            int randInt = (int) Math.floor(Math.random() * (max) + 0);
            Object chosen = list.get(randInt);
        }
        return list;
    }

}

