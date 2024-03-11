package mine;
import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,146,46,9,98};
        Swap(arr, 0, 6);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    } 
    //known as two pointer method
    //Reverse array
    static void reverse(int[] aray){
        int start = 0;
        int end = aray.length-1;
        while(start < end){
            Swap(aray,start,end);
            start++;
            end--;
        }
    }
     //Swap array elements
     static void Swap(int[] aray,int Index1,int Index2){
        int temp = aray[Index1];
        aray[Index1] = aray[Index2];
        aray[Index2] = temp;
    }
   
}
