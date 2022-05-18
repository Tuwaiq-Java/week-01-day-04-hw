public class Circle extends Shape {
    protected double radius = 1.0;
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;

    }
public double getRadius(){
        return radius;
}
public void setRadius(double radius){
        this.radius = radius;
}
public double getArea(){
        return 0;
}
public double getPerimeter(){
        return 0;
}
public String toString(){
        return "Circle [ Shape [ color = "+color
                +", filled = "+ filled + ", filled = " + radius +" ]";
}
}
