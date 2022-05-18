public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        super.greets();
        System.out.println("Wooow");
    }

    @Override
    public void greets(Dog dog) {
        super.greets(dog);
        System.out.println("WoooooW");
    }
    public void greets(BigDog dog){
        System.out.println("WoooooooooW");
    }
}
