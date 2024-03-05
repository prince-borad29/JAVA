import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
            int year = sc.nextInt();
            if(year%4==0){
                System.out.println(year+" is Leap Year");
            }
            else{
                System.out.println(year+" is Not Leap Year");
            }
        sc.close();
    }
}
