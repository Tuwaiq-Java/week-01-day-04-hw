package W1D4Hw;

abstract public class Shape {

    protected String color = "red" ;
    //# accessible in the same package and subclasses
    protected boolean filled = true ;



    public Shape(){

    }
    public Shape(String color , boolean filled){
        this.color= color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled(){

        return true;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea(); // abstract method that children must implement ( no body )

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

}
