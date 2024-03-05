package package1.singletone;

public class singelTon {
    private singelTon(){
        System.out.println("HEllo i am private property.");
    }

    private static singelTon instance;

    public static singelTon getInstance(){
        if (instance == null){
            instance = new singelTon();
        } 
            
        return instance;
    }
}
