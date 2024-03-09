package package1.OOP.properties.abstraction;

public abstract class Parent {

    //all child class to have override below abstract method
    /*
     Q. Why not defining here ?
     -> Because i know that these methods needs to be overridden then why i make it dirty
     -> 
     */

    int age;
    abstract void career(String name);
    abstract void Age(String name,int age);
    
}