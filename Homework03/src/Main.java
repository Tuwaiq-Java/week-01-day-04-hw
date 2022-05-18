public class Main {
    public static void main(String[] args) {
        Square s =new Square(3);
        s.setWidth(s.getSide());
        s.setLength(s.getSide());
        System.out.println(s.toString());
    }
}
