package com.package4;


public class Demo {

    public static void main(String[] args) {
        //E2
   MovablePoint movablePoint=new MovablePoint(3,4,2,2);
      movablePoint.moveDown();
       System.out.println(movablePoint.x);
     //EQ1:
      Animal animal1= new Cat("Lolo") ;
      animal1.greets();
      Cat cat=new Cat("lily");
        cat.greets();

      Animal animal2= new Dog("Dogy") ;
        animal2.greets();
        Dog dog=new Dog("sami");
        dog.greets();
        dog.greets(new Dog("toto"));

        Animal animal3= new BigDog("Boy") ;
        animal3.greets();
        Dog dog2=new Dog("sami");
        BigDog bigDog=new BigDog("Big");
        bigDog.greets();
        bigDog.greets(dog2);
        bigDog.greets(bigDog);


     //EQ3:
      Circle circle=new Circle();
        System.out.println(circle.color);
        System.out.println(circle.filled);
        circle.setFilled(false);
        System.out.println( circle.toString());


        Rectangle rectangle= new Rectangle();
        rectangle.setWidth(8);
        System.out.println(rectangle.toString());


        Square square=new Square();
        System.out.println(square.getColor());
        System.out.println(square.toString());
        }


}
