class Car{
    String fuel;

    void Speed(){
        System.out.println("I CAN SPEED");
    }
}

class Maruti extends Car{
    String gearType;
    void gear(){
        System.out.println("6th Gear");
    }
}

class Maruti800 extends Maruti{
    void getModel(){
        System.out.println("Model : Maruti 800");
    }

    void Display(){
        getModel();
        System.out.println("Geat Type : "+this.gearType);
        gear();
    }
}
public class Ex5_3 {
    public static void main(String[] args) {
        Maruti800 m800 = new Maruti800();

        m800.gearType="Manual";
        m800.Display();
    }
}
