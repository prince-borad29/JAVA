package mine;
import java.util.Scanner;
class checkAlpha{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character : ");
        char c = sc.next().charAt(0);
        sc.close();
        if(c>='a' && c<='z'){
            System.out.println("LOWERCASE");
        }
        else{
            System.out.println("UPPERCASE");
        }
    }
}