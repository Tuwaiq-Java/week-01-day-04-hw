interface Movable {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}
public class MovablePoint implements Movable{
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
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getxSpeed() {
        return xSpeed;
    }
    public int getySpeed() {
        return ySpeed;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }
    @Override
    public void moveUp() {
        setY(getY() - ySpeed);
    }

    @Override
    public void moveDown() {
        setY(getY() + ySpeed);
    }

    @Override
    public void moveLeft() {
        setX(getX() - xSpeed);
    }
    @Override
    public void moveRight() {
        setX(getX() + xSpeed);
    }
    @Override
    public String toString() {
        return "MovablePoint(" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ')';
    }
}
public class Main {
    public static void main(String[] args) {
       MovablePoint m1 = new MovablePoint(12,23,34,45);
       m1.moveUp();
       m1.moveDown();
       m1.moveLeft();
       m1.moveRight();
    }
}