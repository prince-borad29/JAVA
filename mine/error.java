package mine;
import java.util.Arrays;
import java.util.Scanner;

public class error {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int row,col,i,j;

        System.out.println("Enter number of row=>");

        row=sc.nextInt();

        System.out.println("Enter number of column=>");

        col =sc.nextInt();

        int [][] t= new int[row][col];

        int [][] k= new int[row][col];

        int [][] p= new int[row][col];

        System.out.println("Enter valuse of 1st array:-");

        for(i=0;i<row;i++)

        {

            for(j=0;j<col;j++)

            {

            System.out.println("Enter array["+i+"]["+j+"]=");

            t[i][j]=sc.nextInt();

            }

        }

        for(i=0;i<row;i++)

        {

            for(j=0;j<col;j++)

            {

            System.out.println("Enter array["+i+"]["+j+"] = ");

            k[i][j]=sc.nextInt();

            }

        }

        for(i=0;i<row;i++)

        {

            for(j=0;j<col;j++)

            {

                p[i][j]=(t[i][j]+k[i][j]);

            }

        }

        for(i=0;i<row;i++)

        {

            for(j=0;j<col;j++)

            {

                System.out.print(p[i][j]+"\t");

            }
            System.out.println();
        }



    }

}