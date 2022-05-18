package com.work3;

public class Square extends Rectangle{
    private double side;

    public Square(){

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, Boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    public double setSide(double side){
        this.side = side;
        return side;
    }

    @Override
    public void setWidth(double side){
        this.width = side * 2;
    }

    @Override
    public void setLength(double side){
        this.length = side * 4;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}
