package com.package4;



public class Circle extends Shape {
    protected double radius =1.0;
    public Circle(){}
    public Circle(double radius){this.radius=radius;}

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * (this.radius * this.radius);
        return area;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    public double getCircumference() {
       double circumference= Math.PI * 2*this.radius;
        return circumference;
    }

    @Override
    public String toString() {
        return "Circle{ Shape [" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                 "] }";
    }
}
