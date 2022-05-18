package Animals;

public class BigDog extends Dog{

    @Override
    public void greet(){
        System.out.println("wooow");
    }
    @Override
    public void greet(Dog another){
        System.out.println("wooooooow");
    }

    public void greet(BigDog another){
        System.out.println("woooooooooooooow");
    }
    public BigDog(String name) {
        super(name);
    }
}
