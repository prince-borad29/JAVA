import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Of Rows : ");
        int row = sc.nextInt(), i, j, k;

        System.out.print("Enter Number Of Columns : ");
        int col = sc.nextInt();

        // declaring array a for matrix value and ans for matrix multiplied value
        int[][][] a = new int[2][row][col];
        int[][][] ans = new int[2][row][col];

        // getting user input
        for (i = 0; i < 2; i++) {
            System.out.println("Enter Matrix = " + (i + 1));
            for (j = 0; j < row; j++) {
                for (k = 0; k < col; k++) {
                    System.out.print("Enter Value For a[" + i + "][" + j + "][" + k + "] : ");
                    a[i][j][k] = sc.nextInt();
                }
            }
        }

        // matrix multiplication
        for (i = 0; i < 2; i++) {
            for (j = 0; j < row; j++) {
                for (k = 0; k < col; k++) {
                    ans[i][j][k] = 0;
                    for (int l = 0; l < col; l++) {
                        ans[i][j][k] += a[0][j][l] * a[1][l][k];
                    }
                }
            }
        }

        // displaying matrix multiplication
        System.out.println("Matrix Multiplication : ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < row; j++) {
                System.out.print("|");
                for (k = 0; k < col; k++) {
                    System.out.print(ans[i][j][k] + "|");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}
