package package1.OOP.properties.abstraction;

public class Main {
    public static void main(String[] args) {

        Child c = new Child(19);

        c.Age("Prince", 19);
        c.career("Programmer");

        Child2 c2 = new Child2();

        c2.Age("Mayank", 15);
        c2.career("Not Decided Yet");
    }
}
