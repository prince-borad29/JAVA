package package1.OOP.properties.Interfaces;

public class Cdplayer implements Media  {

    @Override
    public void start() {
       System.out.println("Playing song dhum machale dhum dhum");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Player");
    }
    
}
