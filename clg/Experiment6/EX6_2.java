// Create an abstract class Insect that contains abstract method void flystatus(). Provide three classes Termite, Grasshopper and Ant such that each one classes implement flystatus().
package clg.Experiment6;

abstract class Insect{
    abstract void flystatus();
}

class Termite extends Insect{
    @Override
    void flystatus(){
        System.out.println("I Am Termite , I Can't Fly");
    }
}

class Grasshopper extends Insect{
    @Override
    void flystatus(){
        System.out.println("I Am Grassshopper , I Can Fly");
    }
}

class Ant extends Insect{
    @Override
    void flystatus(){
        System.out.println("I Am Ant , I Can't Fly");
    }
}

public class EX6_2 {
    public static void main(String[] args) {
        Termite T = new Termite();
        T.flystatus();

        Grasshopper G = new Grasshopper();
        G.flystatus();

        Ant A = new Ant();
        A.flystatus();
    }
}
