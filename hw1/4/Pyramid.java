public class Pyramid extends Shape{
    double s;
    double h;
    public Pyramid (double s, double h) {

        this.s = s;
        this.h = h;
        this.volume = (1/3.0)*this.s*this.h;
    }


}
