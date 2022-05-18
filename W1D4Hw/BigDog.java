package W1D4Hw;

public class BigDog extends Dog {




    @Override
    public void greets() {
        super.greets();
        System.out.println("wooof");
    }


    @Override
    public void greets(Dog another) {
        super.greets(another);
        System.out.println("woooooof");

    }




    public void greets(BigDog another){
        System.out.println("woooooooof");
    }

    public BigDog(String name){
        super(name);
    }
}
