package package1.OOP.properties.Interfaces.ExtendDemo2;

public class Main implements A , B{

    // @Override
    // public void fun() {
    //    System.out.println("What's Hppening Here ? My mind is not working !");
    // }

    @Override
    public void greet() {
        fun();
        System.out.println("Congrats , You're on right path keep going");
    }
    
    public static void main(String[] args) {
        Main ex = new Main();
        ex.greet();
        A.stat();
    }
}
