import java.util.Scanner;

class employee1{
    //member declaration 
    int e_id,salary,age;
    String e_name;

    //scanner object created 
    Scanner sc = new Scanner(System.in);

    //constructor for getting user input
    employee1(){  
        System.out.print("Enter Employee id : ");
        this.e_id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name : ");
        this.e_name = sc.nextLine();

        System.out.print("Enter Emplloyee Salary : ");
        this.salary = sc.nextInt();
        sc.nextLine();


        System.out.print("Enter Employee Age : ");
        this.age = sc.nextInt();

       
    }

    //function for finding highest salary
    static employee1 highest(employee1[] obj){
        int l = obj.length;
        employee1 max = obj[0];
        
        for(int i=0;i<l;i++){
            if(max.salary<obj[i].salary){
                max = obj[i];
            }
        }
    
        return max;
    }
    
    //overriding toString mrthod
    public String toString() {
        return "Employee{" +
                "id=" + e_id +
                ", name='" + e_name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}

public class Ex4_7 {
    public static void main(String[] args) {
        employee1[] e = new employee1[3];

        for(int i=0;i<3;i++){
        e[i] = new employee1();
        }
        System.out.println(employee1.highest(e));
    }  

}

