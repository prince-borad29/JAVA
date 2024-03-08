import java.util.Scanner;

class employee{
    int e_id,salary,age;
    String e_name;
    employee(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee id : ");
        this.e_id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter employee name : ");
        this.e_name = sc.nextLine();

        System.out.println("Enter Emplloyee Salary : ");
        this.salary = sc.nextInt();
        sc.nextLine();


        System.out.println("Enter Employee Age : ");
        this.age = sc.nextInt();
        sc.nextLine();

        
    }
    void empDet(){
        System.out.println("Employee id : "+this.e_id);
        System.out.println("Employee Name : "+this.e_name);
        System.out.println("Employee Salary : "+this.salary);
        System.out.println("Employee age : "+this.age);
    }
    
}

public class Ex4_2 {
    public static void main(String[] args) {
        employee e1 = new employee();
        e1.empDet();       
    }  
}
