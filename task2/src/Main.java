public class Main{
    public static void main(String[] args){
        Parallelogram square = new Parallelogram();
        Parallelogram rectangle = new Parallelogram();
        System.out.println("Perimetrul patratului "+square.calculatePerimeter(5));
        System.out.println("Aria patratului "+square.calculateArea(5));
        System.out.println("Permitetrul dreptunghiului "+rectangle.calculatePerimeter(3,5));
        System.out.println("Aria dreptunghiului "+rectangle.calculateArea(3,5));
    }
}