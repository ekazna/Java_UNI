public class Cylinder extends SolidOfRevolution{
    double height;
    public Cylinder(double radius, double height) {

        this.radius = radius;
        this.height = height;
        this.volume = Math.PI*getRadius()*getRadius()*this.height;
    }


}
