package mine;
import java.util.Arrays;
public class StringMethod {
    public static void main(String[] args) {
       String name = "Prince Borad A code Learner";
       System.out.println(Arrays.toString(name.toCharArray()));
       System.out.println(name.toLowerCase());
       System.out.println(name.toUpperCase());
       System.out.println(Arrays.toString(name.split(" ")));
    }
}