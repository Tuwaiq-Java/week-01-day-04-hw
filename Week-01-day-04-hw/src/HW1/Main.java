package HW1;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle("Blue", true, 3.40);
        System.out.println("circle.toString(): " + circle.toString());
        Rectangle rectangle = new Rectangle("Green", true);
        System.out.println("rectangle.toString(): " + rectangle.toString());
        Square square = new Square("Red", true, 7.2);
        System.out.println("square.toString(): " + square.toString());

    }
}
