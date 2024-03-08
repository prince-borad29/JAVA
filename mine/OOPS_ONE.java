package mine;
class Pen {
    String color;
    String brand;
    String type;

    public void write(){
        System.out.println("Writing Something");
        System.out.println(brand);
    }
    public void printColor(){
        System.out.println(this.color);
    }
 }
public class OOPS_ONE{
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color="Red";
        pen1.brand="BIC";
        pen1.type="0.5mm";

        Pen pen2 = new Pen();
        pen2.color="Black";
        pen2.brand="Cello";
        pen2.type="Gel 0.5mm";

        pen1.printColor();
        pen1.write();
        pen2.printColor();
    }
}

