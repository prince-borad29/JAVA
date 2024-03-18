//import java.util.Scanner;
public class EXCeption1 {
    
    public static void main(String[] args) {
        try{
            int a;
             a = 100/0;
             System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("I am catch");
        }
        finally{
            System.out.println("I am finally");
        }
        
    }
}