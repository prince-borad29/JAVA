package package1.OOP.properties.Interfaces.Nested;

public class A {
    //nested interface
    public interface nestedInterface{
        boolean isOdd(int num);
    }
}


 class B implements A.nestedInterface{
    
    public boolean isOdd(int num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}

