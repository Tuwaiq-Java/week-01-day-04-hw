package HW1;

public class Square extends Rectangle{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        this.width = side * 2;
    }

    @Override
    public void setLength(double side) {
        this.length = side * 4;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
