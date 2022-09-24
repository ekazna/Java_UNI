public class Vectors {
    double x;
    double y;
    double z;
    public Vectors(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
        double[] coords = new double[3];
        coords[0] = this.x;
        coords[1] = this.y;
        coords[2] = this.z;

    }
    public void printVector(){
        System.out.print(this.x + " " + this.y + " " + " " + this.z);
    }
    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
    public double scalarMult(Vectors vect2) {
        return this.x * vect2.x + this.y * vect2.y + this.z * vect2.z;
    }
    public Vectors vectMult(Vectors vect2){
        Vectors newVect = new Vectors(
        this.y * vect2.z - this.z * vect2.y,
                this.z * vect2.x - this.x * vect2.z,
                this.x * vect2.y - this.y * vect2.x);
        return newVect;
    }
    public double cos(Vectors vect2) {
        return scalarMult(vect2) / (this.length() * vect2.length());
    }
    public Vectors add(Vectors vect2){
        Vectors newVect = new Vectors(this.x +vect2.x, this.y+vect2.y, this.z+vect2.z);
        return newVect;
    }
    public Vectors sub(Vectors vect2){
        Vectors newVect = new Vectors(this.x -vect2.x, this.y-vect2.y, this.z-vect2.z);
        return newVect;
    }
    public static Vectors[] newVectors(int N){
        Vectors[] newVectors = new Vectors[N];
        for (int i = 0; i < N; i++) {
            newVectors[i] = new Vectors(
                    Math.random()/Math.nextDown(1.0),
                    Math.random()/Math.nextDown(1.0),
                    Math.random()/Math.nextDown(1.0));
        }
        return newVectors;
    }

}
