package mine;
public class scop {
    public static void main(String[] args) {
        int a = 10;
        String b = "Prince";
        System.out.println("Outside scope a = "+a);
        System.out.println("Outside scope b = "+b);
        {
            a = 100;
            b = "borad";
        }
        System.out.println("Outside scope after modify a = "+a);
        System.out.println("Outside scope after modify b = "+b);

        change(a,b);
        System.out.println("Afer change() a = "+a);
        System.out.println("Afer change() b = "+b);
    }
    static void change(int num,String s){
        num = 11;
        s = "done";
    }
}
