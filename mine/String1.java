package mine;
public class String1 {
    public static void main(String[] args) {
        String s1= "ABCB" , s2 = "DEF" , s3 , s4;
        s3 = s1.concat(s2);
        s4 = s2.concat(s1).concat(s3);

        System.out.println("S1.charAt(1) = "+s1.charAt(1));
        System.out.println("S1.indexOf('B') = "+s1.indexOf('B'));
        System.out.println("S1.lastIndexOf('B') = "+s1.lastIndexOf('B'));
        System.out.println("S1 = "+s1);
        System.out.println("S2 = "+s2);
        System.out.println("S3 = "+s3);
        System.out.println("S4 = "+s4);
    }
}
