package W1D4Hw;

public class Rectangle extends Shape{

    protected double width = 1.0;
    protected double length = 1.0;


    public Rectangle(double width , double length){
        this.width = width;
        this.length = length;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
       // this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double width , double length , String color , boolean filled){
        super(color , filled);
        this.width = width;
        this.length = length;

    }

    public Rectangle(){

    }


    @Override
    public String toString() {
        return "Rectangle{ Shape" +
                "width=" + width +
                ", length=" + length +
                "color=" + color +
                "filled" + filled +
                '}';
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
