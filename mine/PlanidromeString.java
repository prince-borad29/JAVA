package mine;
import java.util.Scanner;;
public class PlanidromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine(),p="";
        sc.close();
        int L=s.length()-1;
        for(int i=L;i>=0;i--){
            p += s.charAt(i);
        }
        if (s.equalsIgnoreCase(p)) {
            System.out.println(s+" = "+p+" Is Palindrome");
        }
        else {
            System.out.println(s+" != "+p+" Is Not Palindrome");
        }
    }
}
