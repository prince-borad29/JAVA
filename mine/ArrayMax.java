package mine;
public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {1,2,3,146,46,9,98};
        System.out.println(maxArr(arr));
    }
    static int maxArr(int[] aray){
        int max = aray[0];
        for (int i = 0; i < aray.length; i++) {
            if(aray[i]>max){
                max = aray[i];
            }   
        }
        return max;
    }
}
