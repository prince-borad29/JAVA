package package1.OOP.properties.Interfaces;

public class Powerengine implements Engine {

    @Override
    public void start() {
        System.out.println("Power Engine Starts");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stops");
    }

    @Override
    public void acc() {
        System.out.println("Power Engine Accelerate");
    }
    
}
