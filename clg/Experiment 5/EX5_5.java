// Create a class Student with static method getName() ,SetName(), ShowDetails()  and with some data member like name,Rollno,Branch,sem,college. Using getName() take input from user and using SetName() change details of mention data member. Finally display updated values of Student.
import java.util.Scanner;

class Student{
    static String name,Branch,college;
    static int Rollno,sem;

   static Scanner sc = new Scanner(System.in);
    static void setDetails(){
        // Student s = new Student();
        System.out.print("Enter Name : ");
        name =sc.nextLine();

        System.out.print("Enter Roll No : ");
        Rollno =sc.nextInt();
        
        System.out.print("Enter Sem : ");
        sem =sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Branch Name : ");
        Branch =sc.nextLine();
        // sc.nextLine();

        System.out.print("Enter College Name : ");
        college =sc.nextLine();
     
    }

    void getName(){
        System.out.println("Name : "+name);
    }

    static void SetName(){
        System.out.print("Enter Name To Update : ");
        name =sc.nextLine();
    }

    static void ShowDetails(){
        System.out.println("--------------------");
        System.out.println("Name is "+name);
        System.out.println("RollNo is "+Rollno);
        System.out.println("Sem is "+sem);
        System.out.println("Branch is "+Branch);
        System.out.println("College is "+college);
        System.out.println("--------------------");
    }
}
public class EX5_5 {
    public static void main(String[] args) {
        // Student s1 = new Student();
        Student.setDetails();
        Student.ShowDetails();
        Student.SetName();
        Student.ShowDetails();
    }
}
