public class Main {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(80, 8);
        Ball b1 = new Ball(30, 1.927);
        Pyramid p1 = new Pyramid(30, 2, 5);
        Box box1 = new Box(123);

        System.out.println(box1.add(b1));
        System.out.println(box1.add(c1));
        System.out.println(box1.add(p1));


    }
}