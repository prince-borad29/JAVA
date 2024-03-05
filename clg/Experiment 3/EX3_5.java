public class EX3_5 {
    public static void main(String[] args) {
        String s1 = " ABCB ", s2 = "DEF";

        System.out.println("s1.charAt(1) = " + s1.charAt(1));
        System.out.println("s1.length() = " + s1.length());
        System.out.println("s1.concat(s2) = " + s1.concat(s2));
        System.out.println("s1.indexOf('B') = " + s1.indexOf('B'));
        System.out.println("s1.lastIndexOf('B') = " + s1.lastIndexOf('B'));

        String prefix = "Pr";
        String suffix = "ce";

        System.out.println("startsWith() : " + s1.startsWith(prefix));
        System.out.println("endsWith() : " + s1.endsWith(suffix));
        System.out.println("trim(s1) : "+s1.trim());

    }
}
