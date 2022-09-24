public class Box extends Shape{

    private double freeVolume;

    public Box(double volume) {
        super(volume);
        this.freeVolume = volume;
    }

    public boolean add(Shape shape){
        if ((this.freeVolume - shape.getVolume()) >= 0){
            this.freeVolume -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}
