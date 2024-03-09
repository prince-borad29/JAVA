package package1.OOP.properties.Interfaces;

public class NiceCar {
    private Engine engine;
    private Cdplayer music;
    public NiceCar(){
        engine = new Powerengine();
        music = new Cdplayer();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void Start(){
        engine.start();
    }

    public void Stop(){
        engine.stop();
    }
    
    public void startMusic(){
        music.start();
    }

    public void stopMusic(){
        music.stop();
    }

    public void upgradeEngine(Engine engine){
        this.engine = engine;
        System.out.println("Engine Upgraded ");
    }
}
