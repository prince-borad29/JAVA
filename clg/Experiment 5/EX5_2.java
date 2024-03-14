class Vehicle{

    void run(){
        System.out.println("I am vehicle");
    }

}

class Bike extends Vehicle{
    //overriding method run()
    void run(){
        System.out.println("I am Bike , I can runnnnnnnnn ..");
    }
}

public class EX5_2 {
    public static void main(String[] args) {
        Vehicle b1 = new Vehicle();
        Vehicle v1 = new Bike();
        b1.run();
        v1.run();
    }
}
