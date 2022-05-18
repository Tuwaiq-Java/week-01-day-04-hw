public class HW3 {

    public static void main(String[] args) {
        System.out.println("wow");
    }

    public abstract class Shape {
        protected String color;
        protected boolean filled;

        public Shape() {
        }

        public Shape(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public boolean isFilled() {
            return filled;
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        abstract double getArea();
        abstract double getPerimeter();

        @Override
        public String toString() {
            return "Shape{" +
                    "color='" + color + '\'' +
                    ", filled=" + filled +
                    '}';
        }
    }
    class Circle extends Shape {

        private double radius = 1.0;

        public Circle() {

            radius = 1.0;
        }

        public Circle(double radius) {

            this.radius = radius;
        }

        public double getRadius() {

            return radius;
        }

        public void setRadius(double radius) {

            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * Math.pow(this.radius, 2);
        }

        @Override
        double getPerimeter() {
            return 0;
        }
        public String toString() {
            return "The radius is: " + this.radius;
        }
    }

    class Rectangle extends Shape{

        protected double width;
        protected double length;

        public Rectangle(){
            this.width = 1.0;
            this.length = 1.0;
        }

        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }

        public Rectangle(String color, boolean filled, double width, double length) {
            super(color, filled);
            this.width = width;
            this.length = length;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }


        @Override
        double getArea() {
            return 0;
        }

        @Override
        double getPerimeter() {
            return 0;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "width=" + width +
                    ", length=" + length +
                    ", color='" + color + '\'' +
                    ", filled=" + filled +
                    '}';
        }
    }

    class Square extends Rectangle{
        public Square() {
        }

        public Square(double side) {
            super(side, side);
        }

        public Square(double side,String color, boolean filled) {
            super(color, filled, side, side);
        }
        public void getSide(){
            getWidth();
        }
        public void setSide(double side){
            setWidth(side);
            setLength(side);
        }
        public void setWidth(double side){
            setWidth(side);
        }
        public void setLength(double side){
            setLength(side);
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

    public abstract class Animal{
        private String name;
        public Animal(String name) {
            this.name = name;
        }
       public abstract void greets();
    }

    class Cat extends Animal{
        public Cat(String name) {
            super(name);
        }
        @Override
        public void greets() {

        }
    }

    class Dog extends Animal{
        public Dog(String name) {
            super(name);
        }
        @Override
        public void greets() {
            System.out.println("woof");
        }
        public void greets(Dog dog) {
            System.out.println("wooooooof");
        }
    }
    class BigDog extends Dog{
        public BigDog(String name) {
            super(name);
        }
        @Override
        public void greets() {
            System.out.println("woow");
        }
        public void greets(Dog dog) {
            System.out.println("wooooooow"
            );
        }
        public void greets(BigDog bigDog) {
            System.out.println("wooooooooooooooow");
        }
    }


    public interface Movable {
    public abstract void moveUp();
    public abstract void moveDown();
    public abstract void moveLeft();
    public abstract void moveRight();
    }

    class MovablePoint implements Movable{
        int x;
        int y;
        int xSpeed;
        int ySpeed;

        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        @Override
        public String toString() {
            return "MovablePoint{" +
                    "x=" + x +
                    ", y=" + y +
                    ", xSpeed=" + xSpeed +
                    ", ySpeed=" + ySpeed +
                    '}';
        }

        @Override
        public void moveUp() {
            this.y-=this.ySpeed;
        }

        @Override
        public void moveDown() {
            this.y+=this.ySpeed;
        }

        @Override
        public void moveLeft() {
            this.x-=this.xSpeed;
        }

        @Override
        public void moveRight() {
            this.x+=this.xSpeed;
        }
    }
}

