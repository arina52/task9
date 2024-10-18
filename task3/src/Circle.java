public class Circle extends TwoDimensionalShape{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return 3.14 *radius*radius;
    }
}
