public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("hier");
    }

    @Override
    public void greets(Dog another) {
        System.out.println("koky");
    }

    public void greets(BigDog bigDog) {
        System.out.println("negan");
    }
}