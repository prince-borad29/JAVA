package clg.Extra;
public class MethosOverloading {
    public static void main(String[] args) {
        
    }
    void add(){
        System.out.println("null");
    }
    void add(int a){
        System.out.println("a = "+a);
    }
    double add(double a){
        return a;
    }
}
