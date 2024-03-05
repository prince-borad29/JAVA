import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,2,3,6,5,5,5,5,55,94,55,8,9,6,9,74,5,8,2,3,1,361,66315,3165);
    }
    static void fun(int ...p){
        System.out.println(Arrays.toString(p));
    }
}
