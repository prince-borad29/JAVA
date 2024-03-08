package mine;
public class string2 {
    public static void main(String[] args) {
        String s1 =" P r i n c e ";
        String prefix ="Pr";
        String suffix ="ce";

         System.out.println("Prefix : "+s1.startsWith(prefix));
         System.out.println("Suffix : "+s1.endsWith(suffix)); 
         System.out.println(s1.trim());
    }
}
