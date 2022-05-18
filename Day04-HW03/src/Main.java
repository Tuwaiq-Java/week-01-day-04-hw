import Animals.*;
import Shapes.*;
import MovablePoints.*;

public class Main {
    public static void main(String[] args) {
//        Question 1 testing:

        Square square = new Square("Blue", false, 4.2);
        square.setLength(3.4);
        square.setWidth(1.34);
        System.out.println(square.toString());


//       =================================================
//      Question 2 testing:

        Dog sDog = new Dog("Doge");
        Dog bDog = new BigDog("Lola");
        Animal cat = new Cat("Kay");
        sDog.greet();
        sDog.greet(new Dog("Tony"));
        bDog.greet();
        bDog.greet(new BigDog("Gunter"));
        BigDog bigDog = new BigDog("ff");
        bigDog.greet(new BigDog("w"));
        cat.greet();


//        ============================================
//        Question 3 Testing:

        MovablePoint pointA = new MovablePoint(2,2,3,3);
        System.out.println(pointA.toString());
        pointA.moveUp();
        pointA.moveRight();
        System.out.println(pointA.toString());

        MovablePoint pointB = new MovablePoint(4,5,7,2);
        System.out.println(pointB.toString());
        pointB.moveUp();
        pointB.moveRight();
        System.out.println(pointB.toString());







    }
}