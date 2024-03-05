import java.util.Scanner;
class Fscan{
    public static void main(String[]  arg){
       
         Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Name : ");
        // String name = sc.nextLine();
        // System.out.println("Welcome "+name+" ...");
        
        // System.out.print("Enter integer : ");
        // int a = 234_000_000;
        // System.out.println(a);
        
        // System.out.print("Enter decimal point number : ");
        // float b = sc.nextFloat();
        // System.out.println(b);

        System.out.print("Enter Large Decimal POint number : ");
        double d =  sc.nextDouble();
        System.out.println(d); 
        sc.close();
    }
}