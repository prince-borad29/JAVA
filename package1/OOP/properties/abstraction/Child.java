package package1.OOP.properties.abstraction;

public class Child extends Parent{


    Child(int age){
        this.age = age;
    }
    
    @Override
    void career(String name) {
      System.out.println("I am going to beacome "+name+'\n'); 
    }

    @Override
    void Age(String name, int age) {
      System.out.println("My Name is "+name+" And Age is "+age);
    }
    
}
