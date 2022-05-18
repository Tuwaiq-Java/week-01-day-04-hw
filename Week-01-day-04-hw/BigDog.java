package exampl;

public class BigDog extends Dog {
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    public void greets(Dog a) {
        System.out.println("Wooooow");
    }

    public void greets(BigDog a) {
        System.out.println("Woooooooow");
    }
}
