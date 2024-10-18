public class Sphere extends ThreeDimensionalShape{
    private double radius;
    public Sphere(double radius){
        this.radius = radius;
    }
    public double calculateArea(){
        return 4*3.14*radius*radius;
    }
    public double calculateVolume(){
        return 4.0/3.0*3.14*radius*radius*radius;
    }
}
