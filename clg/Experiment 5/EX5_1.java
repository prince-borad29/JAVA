class Animal{
    String Name;

    void eat(){
        System.out.println("I Can Eat");
    }
}
class Dog extends Animal{
    void display(){
        eat();
        System.out.println(this.Name);
    }
}
public class EX5_1 {
    
    public static void main(String[] args) {
       Dog d1 = new Dog();

       d1.Name = "Rotwiller";
       d1.display();
    }
}