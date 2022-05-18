public class Square extends Rectangle{

    public Square(String color, Boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public Square() {
    }

    public Square(double width, double length) {
        super(width, length);
    }

    public double gitSide(){
        return 0.0;
    }

    public void setSide(){

    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
