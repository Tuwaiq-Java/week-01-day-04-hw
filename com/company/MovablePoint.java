package com.company;

public class MovablePoint implements Movable {

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
    public void moveUp() {
        int y1;
        y1 = y - ySpeed;
        System.out.println("MoveUp: " + y1);
    }

    @Override
    public void moveDown() {
        int y2;
        y2 = y + ySpeed;
        System.out.println("MoveDown: " + y2);
    }

    @Override
    public void moveLeft() {
        int x1;
        x1 = x - xSpeed;
        System.out.println("MoveLeft: " + x1);
    }

    @Override
    public void moveRight() {
        int x2;
        x2 = x + xSpeed;
        System.out.println("MoveRight: " + x2);
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

}
