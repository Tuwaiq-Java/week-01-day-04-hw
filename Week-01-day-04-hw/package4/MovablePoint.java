package com.package4;



public class MovablePoint implements Movable {
    int x,y,xSpeed , ySpeed;


    public MovablePoint() {
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x=x;
        this.y=y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "( "+x+" , "+y +" ) , Speed=(" + xSpeed +" , "+ySpeed +  ")";
    }

    @Override
    public void moveUp() {
        System.out.println(y-=ySpeed);
    }

    @Override
    public void moveDown() {
        System.out.println(y+=ySpeed);
    }

    @Override
    public void moveLeft() {
        System.out.println(x-=xSpeed);

    }

    @Override
    public void moveRight() {
        System.out.println( x+=xSpeed);

    }
}
