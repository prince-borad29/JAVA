package mine;

public class MethodOverload {

    public static void main(String[] args) {
         Print();
       System.out.println( Print(5));
    }
    
    static final void Print(){
        System.out.println("I am Void");
    }
    
    static int Print(int a){
        a = 4;
        return a;
    }


}
