package Shapes;

public class Rectangle extends Shape {
protected double length, width = 1.0;
    public Rectangle(){

    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    double getArea() {
        return width*length;
    }

    @Override
    double getPerimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Shapes.Rectangle{" + super.toString()+
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}
