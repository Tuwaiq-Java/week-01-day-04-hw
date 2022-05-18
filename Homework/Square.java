package Homework;

public class Square extends Rectangle{

    public Square(String color, Boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square() {
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setASide(double side) {
     super.setWidth(side);
        super.setLength(side);
    }

    public double getASide() {
        return super.getWidth();
    }
}
