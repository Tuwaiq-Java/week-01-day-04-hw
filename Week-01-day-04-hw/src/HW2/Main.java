package HW2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        cat.greets();

        Dog dog = new Dog("Dog");
        dog.greets();
        dog.greets(dog);
        BigDog bigDog = new BigDog("Dog");
        bigDog.greets();
        bigDog.greets(dog);
        bigDog.greets(bigDog);

    }

}

