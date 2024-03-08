class Vehicle{

    void run(){}

}

class Bike extends Vehicle{
    //overriding method run()
    void run(){
        System.out.println("I am Bike , I can runnnnnnnnn ..");
    }
}

public class EX5_2 {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.run();
    }
}
