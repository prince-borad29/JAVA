// Implement a java program to create a class Box with necessary members  for calculating volume of Box and display it with method name Volume. Create a Box class object and to display the volume of Box.
public class EX4_5 {
    public static void main(String[] args) {
        Box b1 = new Box(56.2f, 12.2f, 23.1f);
        b1.volume();
    }
}

class Box{
   private float l , b , h;

    Box(float l,float b,float h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    void volume(){
        System.out.println("Volume of Box = "+(this.l*this.b*this.h));
    }
}