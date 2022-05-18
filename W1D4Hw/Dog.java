package W1D4Hw;

public class Dog  extends Animal{




    public Dog(){

    }
    public Dog(String name){
        super(name);

    }








    @Override
    public void greets() {
        System.out.println("Woof");

    }
   // overload : same name diff parameters
    public void greets(Dog another){
        System.out.println("Woooof");
    }
}
