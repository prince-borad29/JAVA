package clg;

interface callBack{
    void call(int param);
}
class client implements callBack{
    public void call(int p){
        System.out.println("It Worked ."+p);
    }
    void NonIf(){
        System.out.println("I Am Non Interface Method");
    }
}
public class TestIFDEMO {
    public static void main(String[] args) {
        client c = new client();
        c.call(10);
        c.NonIf();
    }
    
}
