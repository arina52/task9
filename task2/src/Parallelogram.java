public class Parallelogram {
    public int calculatePerimeter(int length, int width) {
        return 2*(length+width);
    }
    public int calculatePerimeter(int sideLength) {
        return 4*sideLength;  //pt patrat
    }
    public double calculateArea(int length, int width) {
        return length*width;  //pentru dreptunghi
    }
    public double calculateArea(int sideLength) {
        return sideLength*sideLength;
    }
}
