package mine;
import java.util.*;
class array3d{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[][][] = new int[2][2][2],i,j,k;

        for(i=0;i<arr.length;i++){
            System.out.println("Array : "+(i+1));
        for(j=0;j<arr[i].length;j++){
        for(k=0;k<arr[i][j].length;k++){
            System.out.print("Enter arr["+i+"]["+j+"]["+k+"] : ");
            arr[i][j][k] = sc.nextInt();
        }
        }        
    }
        // for(i=0;i<arr.length;i++){
        //     System.out.println("Array : "+(i+1));
        // for(j=0;j<arr[i].length;j++){
        // for(k=0;k<arr[i][j].length;k++){
        //     System.out.print("arr["+i+"]["+j+"]["+k+"] = "+arr[i][j][k]+"\t");
        // }System.out.println();
        // }        
        // }
            for(int[][] a : arr){
                for (int[] ks : a) {
                    System.out.println(Arrays.toString(ks));
                }
            }
}
}