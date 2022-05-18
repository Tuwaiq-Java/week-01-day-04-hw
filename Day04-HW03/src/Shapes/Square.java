package Shapes;

public class Square extends Rectangle{
    double side;
    public Square(){}
    public Square(double side){
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
    public void setWidth(double side){
        this.width = side;
    }
    public void setLength(double side){
        this.length = side;
    }

    @Override
    public String toString() {
        return "Shapes.Square{" + super.toString() + '}';
    }
}
