public class String3 {
   public static void main(String[] args) {
    String s1 = "Hello Prince";
    String s2 = "hello prince";
    String s3 = "P";

    System.out.println("s1 = s2 : "+s1.equals(s2)); 
    System.out.println("s2 = s1(IgnoreCase) : "+s2.equalsIgnoreCase(s1)); 
    System.out.println("s3 = s2 : "+s2.equals(s3)); 
   } 
}
