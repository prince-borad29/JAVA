//import java.util.Scanner;
public class StringBuilder1 {
    
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in); sc.close();
        StringBuilder stb = new StringBuilder();
        // String s = "Prince";
        // sb.append(s);
        for(int i =0;i<26;i++){
            char ch1 = (char)('a'+i);
            stb.append(ch1);
        } 
        System.out.println(stb.toString());
    }
}