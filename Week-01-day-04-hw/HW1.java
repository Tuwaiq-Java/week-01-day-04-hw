abstract public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    abstract public  void greets();

}
public class Cat  extends Animal{
    public Cat(String name) {
        super(name);
    }
    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void greets() {
        System.out.println("Woof!");
    }
    public void greets(Dog another) {
        System.out.println("Woooof!");
    }
}
public class Main {
    public static void main(String[] args) {
      Cat cat1 = new Cat("mew!");
      cat1.greets();
      Dog dog1 = new Dog("woof");
      dog1.greets();
      BigDog dog2 = new BigDog("mew!big");
      dog2.greets();
      Animal animal = new Cat("mew! from animal");
      animal.greets();
    }
}