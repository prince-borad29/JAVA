package mine;
public class isPrime implements snippet {
    public static void main(String[] args) {
        System.out.println(isPrimee(13));
    }
    static boolean isPrimee(int num){
        if(num<=1){
            return false;
        }
        int c =2;
        while (c*c<=num)
        {
            if(num%c==0) {
                return false;
             }
            c++;
        }
        return c*c>num;
    }
}
