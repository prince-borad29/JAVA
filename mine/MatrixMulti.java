import java.util.Scanner;
public class MatrixMulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Of Rows : ");
        int row = sc.nextInt(),i,j,k;

        System.out.print("Enter Number Of Columns : ");
        int col = sc.nextInt();

        //declaring array a for matrix value and ans for matrix mulplied value
        int[][] a = new int[row][col] , b = new int[row][col] , ans = new int[row][col];

        
        System.out.println("For Matrix 1 ");
        //getting user input
        for (i = 0; i < row; i++) {
            for ( j = 0; j < row; j++) {
                  System.out.print("Enter Value For a["+i+"]["+j+"] : ");
                  a[i][j] = sc.nextInt();
            }
        }

        System.out.println("For Matrix = 2");
        for (i = 0; i < row; i++) {
            for ( j = 0; j < col; j++) {
                  System.out.print("Enter Value For b["+i+"]["+j+"] : ");
                  b[i][j] = sc.nextInt();
            }
        }

       // sc.close();

        //matrix multiplication 
        for (i = 0; i < row; i++) {
            for ( j = 0; j < col; j++) {
               ans[i][j] = 0;
                for(k = 0; k<col; k++){
                    ans[i][j] += a[i][k]*b[k][j];
                }
            }
        }

        //displaying matrix multiplication
        System.out.println("Matrix Multiplication : ");
        for (i = 0; i < a.length; i++) {
            System.out.print("|");
            for ( j = 0; j < a[i].length; j++) {
              System.out.print("ans["+i+"]["+j+"] = "+ans[i][j]+" ");
            }System.out.println(" ");
        }

    }//psvm over
}//class over
