package package1.OOP.properties.Interfaces;

public class Car implements Engine , Break , Media{

    @Override
    public void brake() {
       System.out.println("I brake Like WOW");
    }

    @Override
    public void start() {
        System.out.println("I start Like ratatatattata");
    }

    @Override
    public void stop() {
       System.out.println("I stop Like DHAKH DAKH");
    }

    @Override
    public void acc() {
       System.out.println("I accelerate Like HUN huN HUNNNNNNNNNNNNN nnnnnnnnnn");
    }
    
}
