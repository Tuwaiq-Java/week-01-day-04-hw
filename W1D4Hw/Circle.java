package W1D4Hw;

public class Circle extends Shape{

    protected double radius = 1.0;



    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;

    }
    public Circle(double radius , String color , boolean filled){
        super(color, filled);
        this.radius = radius;

    }

    @Override
    public String toString() {
        return "Circle{ Shape " +
                "color=" + color +
                "filled=" + filled +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }










}
