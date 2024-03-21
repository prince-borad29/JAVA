package clg.Exp;
interface vehicle{
    void speed(int s);
    void fuelType(String FT);
}

interface two_wheeler extends vehicle{   
   
}
    
interface three_wheeler implements vehicle{
   
}
interface four_wheeler implements vehicle{
    
}

class Vehicle1 implements two_wheeler , three_wheeler , four_wheeler{
    private vehicle two ;
    private vehicle three ;
    private vehicle four ;

    Vehicle1(){
        two = new two_wheeler();
    }
    @Override
    public void speed(int s){
        System.out.println("I am Two Wheeler , My Speed is : "+s);
    }

    @Override
    public void fuelType(String FT){
        System.out.println("My Fuel Type is : "+FT);
    }

}
public class EX6_3mutiIf {
    

    two.speed(10);
}
