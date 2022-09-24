public class Main {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder(20, 8);
        Ball b1 = new Ball(3);
        Pyramid p1 = new Pyramid(30, 50);
        Box box1 = new Box(1000);

        System.out.println(box1.add(b1));
        System.out.println(box1.add(c1));
        System.out.println(box1.add(p1));


    }
}