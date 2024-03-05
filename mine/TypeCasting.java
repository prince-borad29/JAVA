import java.util.Scanner;
class TypeCasting{

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        sc.close();
        
    //Implicit type casting
        float b = 11;
        System.out.println(b);

    //Explicit type casting
        int a = (int)(56.23f);
        System.out.println(a);

    //Automatic Type Promotion In Expression
        // int num = 260;
        // //byte range is till 256
        // byte bt = (byte)(num); //260 % 256 = 1
        // System.out.println(bt);

        // byte n1 = 50 , n2 = 70 ,  n3 = 100;
        // int d = n1 * n2 / n3;
        //  System.out.println(d);

    //     byte d = 50;
    //    int dd = d * 2;
    //    System.out.println(dd);

    


    }
}
