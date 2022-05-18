abstract class Shape {
    protected String color = "red";
    protected boolean filled = true;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){
        return false;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract void getArea();
    abstract void getPerimeter();

    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ']';
    }
}
public class Circle extends  Shape{
    protected double radus = 1.0;
    public Circle(double radus) {
        this.radus = radus;
    }
    public Circle(double v, String red, boolean b) {
    }
    public double getRadus() {
        return radus;
    }
    public void setRadus(double radus) {
        this.radus = radus;
    }
    @Override
    void getArea() {
    }
    @Override
    void getPerimeter() {
    }
    public Circle(double radus, boolean filled) {
        this.radus = radus;
    }
    @Override
    public String toString() {
        return "Circle[" +
                "radus=" + radus +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ']';
    }
}
public class Rectangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;
    public Rectangle() {
    }

    @Override
    void getArea() {

    }

    @Override
    void getPerimeter() {

    }

    public Rectangle(double width, double length, String red, boolean b) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ']';
    }
}
public class Square extends Rectangle{
    double Side;
    public Square() {
    }
    public Square(double Side) {
      this.Side = Side;
    }
    public Square(double Side,String color, boolean filled) {
        this.Side = Side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return Side;
    }

    public void setSide(double side) {
        Side = side;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square[" +
                "Side=" + Side +
                ", width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ']';
    }
}
public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false);
        s1.getArea();
        s1.getColor();
        s1.toString();

        System.out.println(s1);
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());

        Circle c1 = (Circle)s1;
        System.out.println(c1);

        Shape s3 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(s3);

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);

        Shape s4 = new Square(6.6);
        System.out.println(s4);

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);

        Square sq1 = (Square)r2;
        System.out.println(sq1);
    }
}