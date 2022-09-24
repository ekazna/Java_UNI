public class Ball extends SolidOfRevolution{

    public Ball(double radius) {
        this.radius = radius;
        this.volume = getRadius()*getRadius()*getRadius()*(4/3.0)*Math.PI;
    }

}
