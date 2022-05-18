package com.work3;

public class Circle extends Shape{
    protected double radius = 1.0;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String color,boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return super.toString()+"Circle{" +
                "radius=" + radius +
                '}';
    }
}
