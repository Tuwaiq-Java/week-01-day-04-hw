public class MovablePoint implements Movable{

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    @Override
    public void moveUp() {

        y -=ySpeed;

    }

    @Override
    public void moveDown() {

        y +=ySpeed;
    }

    @Override
    public void moveLift() {

        x -=xSpeed;
    }

    @Override
    public void moveRight() {

        x +=xSpeed;
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
