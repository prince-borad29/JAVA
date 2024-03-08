package mine;
//import java.util.Scanner;
public class Pattern1 {
    /* Step 1 : Num of rows = number of times outer for loop will run 
       Step 2 : Identify for every row number of columns
       Step 3 : What do you need to print
       *
       * *
       * * *
       * * * *
    */ 
    public static void main(String[] args) {
        pattern1(5);        System.out.println();
        pattern2(5);        System.out.println();
        pattern3(5);        System.out.println();
        pattern4(5);        System.out.println();
        pattern28(5);       System.out.println();
        pattern30(5);       System.out.println();
        pattern17(4);       System.out.println();
        pattern31(4);
        
    }
    static void pattern1(int n){
        for(int row=1; row<=4;row++){
            for(int col=1; col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
     static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
     static void pattern3(int n){
        for(int row = 1 ; row<=n;row++){
            for(int j=5;j>=row;j--){
                System.out.print("*");
            }
        System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row = 1 ; row<=2*n;row++){
            int totalCol = row > n ? 2 * n - row : row;
            for(int col=1;col<=totalCol;col++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    static void pattern28(int n){
       for(int row = 1 ; row<=2*n;row++){
            int totalCol = row > n ? 2 * n - row : row;
            int space = n-totalCol;
            for (int spc=1;spc<=space;spc++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalCol;col++){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
    static void pattern30(int n){
         for(int row = 1 ; row<=n;row++){
            int space = n-row;
            for (int spc=1;spc<=space;spc++){
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }  
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
        System.out.println();
        }
    }
    static void pattern17(int n){
         for(int row = 1 ; row<2*n;row++){
            int totalCol = row > n ? 2 * n - row : row ;

            int space =n-totalCol;
            
            for (int spc=1;spc<=space;spc++){
                System.out.print(" ");
            }
            
            for(int col=totalCol;col>=1;col--){
                System.out.print(col);
            }   
            
            for(int col=2;col<=totalCol;col++){
                System.out.print(col);
            }
            
             System.out.println();
        }
    }
    static void pattern31(int n){
        int originalN = n+1;
        n = 2 * n;
        for(int row=1; row < n;row++){
           for(int col=1; col < n ;col++){
                int atEveryIndex = originalN - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
           }System.out.println();
        }
    }
}