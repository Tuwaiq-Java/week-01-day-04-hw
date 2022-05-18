public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("leon");
    }

    public void greets(Dog another) {
        System.out.println("loly");
    }