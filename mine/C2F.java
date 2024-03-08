package mine;
import java.util.Scanner;
class C2F{
    public static void main(String[] args){
        float c,f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in centigrade : ");
        c = sc.nextFloat();
        sc.close();
        f = (c * 9/5)+32;
        System.out.println("Centigrade = "+c+" To Fahrenhit = "+f);
    }  
}