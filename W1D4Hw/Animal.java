package W1D4Hw;

abstract public class Animal {
    private String name ;


    public Animal(){

    }

    public Animal(String name){
        this.name = name;

    }

    abstract public void greets();
}
