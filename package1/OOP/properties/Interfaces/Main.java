package package1.OOP.properties.Interfaces;

public class Main {
    public static void main(String[] args) {
        // Car car1 = new Car();

        //  car1.start();
        //  car1.acc();
        //  car1.stop();

        NiceCar car = new NiceCar();

        car.Start();
        car.startMusic();
        // car.stopMusic();
        car.upgradeEngine(new ElectricEngine());
        car.stopMusic();
        car.Stop();
        car.Start();
        car.startMusic();
    }
}
