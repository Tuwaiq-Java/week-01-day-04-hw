package com.company;

public class Main {
    public static void main(String[] args) {

        //EX1
        Cat cat = new Cat("Cat1");
        cat.greets();

        Dog dog = new Dog("Dog1");
        dog.greets();
        dog.greets(dog);

        BigDog dog2 = new BigDog("Dog1");
        dog2.greets();
        dog2.greets(dog);
        dog2.greets(dog2);

        //Ex2

        MovablePoint mp = new MovablePoint(1,4,6,8);
        mp.moveUp();
        mp.moveDown();
        mp.moveLeft();
        mp.moveRight();
        mp.toString();

        //EX3

        Circle circle = new Circle(5);
        Circle circle2 = new Circle("Red", false, 3);

        circle.getArea();
        circle.getPerimeter();
        circle.toString();

        circle2.getArea();
        circle2.getPerimeter();
        circle2.toString();

        Rectangle rectangle = new Rectangle(10,20);
        Rectangle rectangle2 = new Rectangle("Blue",true,10,20);

        rectangle.getArea();
        rectangle.getPerimeter();
        rectangle.toString();

        rectangle2.getArea();
        rectangle2.getPerimeter();
        rectangle2.toString();

        Square square = new Square(2);
        Square square2 = new Square("Yellow", false, 5);

        square.toString();
        square2.toString();






    }
}