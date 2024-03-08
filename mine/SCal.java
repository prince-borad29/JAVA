package mine;
import java.util.Scanner;
public class SCal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        float num1 = sc.nextFloat();

        System.out.print("Enter operation (+,-,*,/) : ");
        char sign = sc.next().charAt(0);

        System.out.print("Enter number 2 : ");
        float num2 = sc.nextFloat();

        sc.close();

        switch (sign) {
            case '+'->System.out.println(num1+" + "+num2+" = "+(num1+num2));
            case '-'->System.out.println(num1+" - "+num2+" = "+(num1-num2));
            case '*'->System.out.println(num1+" * "+num2+" = "+(num1*num2));
            case '/'->System.out.println(num1+" / "+num2+" = "+(num1/num2));
            default -> System.out.println("Invalid Operation.");
        }
    }
}
