package mine;
import java.util.Scanner;
class fiborecursion{
    static int Fibo(int num){
        if(num == 0 || num == 1){
            return num;
        }
        else{
            return Fibo(num-1)+Fibo(num-2);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter nth term to print : ");
        int term = sc.nextInt();
        sc.close();
        for (int i=0 ; i < term ; i++){
            int res = Fibo(i);
            System.out.print(res + " ");
        }
    }
}