public class Cylinder extends SolidOfRevolution{
    double height;
    public Cylinder(double volume, double radius, double height) {
        super(volume, radius);
        this.height = height;
    }
    public Cylinder(double volume, double radius) {
        super(volume, radius);
        this.height = this.getVolume()/(this.radius*this.radius*Math.PI);
    }

}
