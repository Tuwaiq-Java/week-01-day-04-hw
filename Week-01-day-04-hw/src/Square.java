public class Square extends Rectangle{
    protected double side;
    public Square(){}
    public Square(double side){
        this.side=side;
    }
    public Square(double side, String color, boolean filled){

    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }
public void setWidth(double side){
    super.setWidth(side);

}
    public void setLength(double side){
        super.setLength(side);

    }
    public String toString(){
        return "Square [ Rectangle [ Shape [ color = " + color +
                " , filled = " + filled +
                "] , width = " + width +
                " , length = " + length +
                " ] side = " + side + " ]]";
    }
}
