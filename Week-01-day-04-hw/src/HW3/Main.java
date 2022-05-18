package HW3;

public class Main {

    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(3,2,12,31);

        System.out.println("Initialization: "+movablePoint);
        movablePoint.moveUp();
        System.out.println("moveUp(): "+movablePoint);
        movablePoint.moveDown();
        System.out.println("moveDown(): "+movablePoint);
        movablePoint.moveRight();
        System.out.println("moveRight(): "+movablePoint);
        movablePoint.moveLeft();
        System.out.println("moveLeft(): "+movablePoint);
    }
}
