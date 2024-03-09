package package1.OOP.properties.Interfaces.ExtendDemo2;

public interface A {
    //not allowed 
    // static void stat();
    // should have body

    static void stat(){
        System.out.println("I am Interface static Method");
    }

    default void fun(){
        System.out.println("I am Default One");
    }
}
