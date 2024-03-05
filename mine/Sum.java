import java.util.Scanner;
class Sum{

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Number 1 : ");
    float num1 = sc.nextFloat() ;

    System.out.println("Enter Number 2 : ");
    float num2 = sc.nextFloat();
    sc.close();
    float sum = num1 + num2;
    System.out.println("Sum = "+sum);
    }
}