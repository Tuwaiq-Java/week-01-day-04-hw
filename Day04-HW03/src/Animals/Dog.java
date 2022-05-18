package Animals;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    @Override
    public void greet() {
        System.out.println("Woof!");
    }

    public void greet(Dog another) {
        System.out.println("Wooooooooooooof!");
    }
}
