//import java.util.Scanner;
public class PrettyPrinting {
    
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in); sc.close();
        float a = 12.2313f;
        System.out.printf("%.2f",a);
        System.out.printf("\n%.2f",Math.PI);
        System.out.printf("\n%s","Prince");
    }
}
/*
%%     	Inserts a % sign
%x      %X	Integer hexadecimal
%t      %T	Time and Date
%s      %S	String
%n     	Inserts a newline character
%o     	Octal integer
%f     	Decimal floating-point
%e      %E	Scientific notation
%g     	Causes Formatter to use either %f or %e, whichever is shorter
%h      %H	Hash code of the argument
%d     	Decimal integer
%c     	Character
%b      %B	Boolean
%a      %A	Floating-point hexadecimal
*/