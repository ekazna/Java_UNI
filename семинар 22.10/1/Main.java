

public class Main {
    public static void main(String[] args) {
        Seasons myFav = Seasons.SPRING;
        System.out.println(myFav + " " + myFav.avgTemperature + " " + myFav.getDescription() +'\n');
        printILove(myFav);

        for (Seasons c: Seasons.values()) {
            System.out.println(c + " " + c.getAvgTemperature() +" " + c.getDescription());

        }

    }
    public static void printILove(Seasons in){
        switch (in) {
            case FALL -> System.out.println("Я люблю осень\n");
            case SPRING -> System.out.println("Я люблю весну\n");
            case SUMMER -> System.out.println("Я люблю лето\n");
            case WINTER -> System.out.println("Я люблю зиму\n");
        }

    }
}