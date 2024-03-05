package package1.staicExample;

public class Main {
    public static void main(String[] args){
        System.out.println("Population : "+human.population);
    human h1 = new human(19,"Prince Borad",'M');
    h1.display();
    human h2 = new human(15,"mayank Borad",'M');
    h2.display();
    human h3 = new human(10,"mango Borad",'M');
    h3.display();

    //cannot access non-static methods without it's instance
    Main m = new Main();
     m.greet();
    }

    void greet(){
        System.out.println("Hello");
    }
}
