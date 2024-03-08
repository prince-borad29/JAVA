package mine;
import java.util.*;
public class StringArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
    //     //array of premitives 
    //     int[] a =new int[5];
    //     for(int i=0;i<5;i++){
    //         a[i]= sc.nextInt();
    //     }
    //   
    //     System.out.println(Arrays.toString(a));  

        //array of String 
        String[] str = new String[5];
        for(int i=0;i<5;i++){
            str[i]= sc.next();
        } sc.close();
        // System.out.println("Strings are : ");
        // for(String s : str){
        //    System.out.println(s);
        // }
            System.out.println(str[1]);
    }
   
}