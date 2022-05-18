public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("WoooW");
    }
    public void greets(Dog another) {
        System.out.println("WooooooW");
    }
    public void greets(BigDog another) {
        System.out.println("WooooooooooW");
    }


}
