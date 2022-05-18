package exampl;

public class MovablePoints implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoints(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y-=this.ySpeed;
    }

    public void moveDown() {
        y+=this.ySpeed;
    }

    public void moveLeft() {
        x-=this.xSpeed;
    }

    public void moveRight() {
        x+=this.xSpeed;
    }
}
