package package1.singletone;

public class Main {
    public static void main(String[] args){
        // singelTon st = new singelTon(); not accessible
        System.out.println(singelTon.getInstance());

        singelTon obj1 = singelTon.getInstance();
        singelTon obj2 = singelTon.getInstance();
        singelTon obj3 = singelTon.getInstance();

        System.out.println("OBJ1 = "+obj1);
        System.out.println("OBJ2 = "+obj2);
        System.out.println("OBJ3 = "+obj3);
    }
}
