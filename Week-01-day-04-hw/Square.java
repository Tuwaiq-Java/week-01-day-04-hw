package exampl;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(String color, Boolean filled, double width, double length) {
        super(color, filled, width, length);
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getSide() {
        return 0;
    }
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return super.toString()+super.toString()+"Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
