package package1.OOP.properties.abstraction;

public class Child2 extends Parent{
    @Override
    void career(String name){
        System.out.println("I am Becoming "+name+'\n');
    }

    @Override
    void Age(String name,int age){
        System.out.println("My Name is "+name+" And Age is "+age);
    }
}
