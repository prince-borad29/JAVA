package mine;
// import java.util.Scanner;
public class ArmStrongNum {
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in); 
        // int num = sc.nextInt();
        // sc.close();
        for(int i=100;i<1000;i++){
        if(isArmStrong(i)==true){
            System.out.print(i+" ");
        }
        }
       
    }
    static boolean isArmStrong(int num){
        int org = num;
        int sum = 0;
            while(num>0){
                int rem = num %10;
                sum += rem*rem*rem;
                num /= 10;
            }
            return sum == org;
    }
}