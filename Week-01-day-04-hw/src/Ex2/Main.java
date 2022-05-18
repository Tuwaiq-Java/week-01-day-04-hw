package Ex2;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4.5f, 5.4f);
        Point point2 = new Point(2.35f, 4.43f);

        MovablePoint movablePoint = new MovablePoint(point.getX(),point.getY(),3.1f,4.3f);
        MovablePoint movablePoint2 = new MovablePoint(point2.getX(),point2.getY(),1.12f,3.31f);

        System.out.println(movablePoint.move());
        System.out.println(movablePoint2.move());


    }
}
