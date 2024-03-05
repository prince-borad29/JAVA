import java.util.Scanner;
class LargestNum{
    public static void main(String[] args){
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        num2 = sc.nextInt();
        
        if(num1>num2){
            System.out.println(num1+" num1 is largest");
        }
        else{
            System.out.println(num2+" num2 is largest");
        }sc.close();
    }
}