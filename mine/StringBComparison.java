//import java.util.Scanner;
public class StringBComparison {
    
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in); sc.close();
        // String a = "Prins";
        // String b = "Prins";

        // System.out.println(a == b);//true or false

        String s1 = new String("Prins");
        String s2 = new String("Prins");

        System.out.println(" == gives "+(s1 == s2));//true or false

        System.out.println(" .equals() gives "+s1.equals(s2));
    }
} 