// Implement a java program to create a class Person with data members like age, name ,address, mobile number. and declare them as private along with a method to take input of data member getinput() and for display details show(). Create a Person class object and display details
import java.util.Scanner;

public class Ex4_6 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.getInput();
        p1.show();
    }
}

class Person{
    private int age;
    private long MobileNum;
    private String Name,Address;

    Scanner sc = new Scanner(System.in);
    void getInput(){

        System.out.print("Enter Name : ");
        this.Name = sc.nextLine();

        System.out.print("Enter Age : ");
        this.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Address : ");
        this.Address = sc.nextLine();

        System.out.print("Enter Mobile Number : ");
        this.MobileNum = sc.nextLong();
    }

    void show(){
        System.out.println("Name : "+this.Name);
        System.out.println("Age : "+this.age);
        System.out.println("Address : "+this.Address);
        System.out.println("Mobile Number : "+this.MobileNum);
    }
}
