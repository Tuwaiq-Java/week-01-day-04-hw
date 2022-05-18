package Ex1;

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("salah" , "Riyadh" , "CS" , 2022, 1000.00);
        Student s2 = new Student("Faisal" , "Jeddah" , "English" , 2020, 1300.00);

        Staff staff1 = new Staff("Saleh" , "Riyadh" , "KFUPM" , 30033);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(staff1);

    }
}
