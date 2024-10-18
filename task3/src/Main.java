public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape square = new Square(5);
        Shape sphere = new Sphere(6);
        Shape cube = new Cube(4.5);
        System.out.println("Aria cercului "+circle.calculateArea());
        System.out.println("Aria patrat "+square.calculateArea());
        System.out.println("Aria sfera "+sphere.calculateArea());
        System.out.println("Aria cub "+cube.calculateArea());
        System.out.println("Volumul sferei "+sphere.calculateVolume());
        System.out.println("Volumul cubului "+cube.calculateVolume());
    }
}