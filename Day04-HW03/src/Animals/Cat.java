package Animals;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greet() {
        System.out.println("Meow");
    }
}
