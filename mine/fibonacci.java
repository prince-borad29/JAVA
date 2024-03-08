package mine;
import java.util.Scanner;
class fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N'th term of fibonacci : ");
        int num = sc.nextInt(), a = 0,b =1,count=2;
        sc.close();
        // for(int i = 0;i <= num;i++){
        //     int temp = b;
        //     b = b + a;
        //     a = temp;
        // }
        while(count <= num){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}