public class EX3_4 {
    public static void main(String[] args) {

        int a = 20, b = 10, c = 30, res;

    System.out.println("(a > b) : " + (a > b) +"");
     res = ((a > b) ? (a > c) ? a: c: (b > c)? b: c);//corrected syntax

      System.out.println("Max of three numbers = "+res);
    }//added '}'
}
