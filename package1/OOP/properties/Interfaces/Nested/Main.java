package package1.OOP.properties.Interfaces.Nested;

public class Main{
    public static void main(String[] args) {
        B obj = new B();
        /* 
        * This is not allowed 
        ->  A.nestedInterface nestedObj = new A.nestedInterface();
        */
        System.out.println(obj.isOdd(2));
    }
}