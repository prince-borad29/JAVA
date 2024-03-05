public class ArrayMaxWithinRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,146,46,9,98};
        System.out.println(maxArrRange(arr,3,6));
    }
    //Add some age cases here, like array being null
    static int maxArrRange(int[] aray,int Start,int End){
        if(End < Start || aray == null ){
            return -1;
        }
        int max = aray[Start];
        for (int i = Start; i <= End; i++) {
            if(aray[i]>max){
                max = aray[i];
            }   
        }
        return max;
    }
}
