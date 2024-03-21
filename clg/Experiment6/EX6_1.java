// Create an interface named Shape that contains empty methods named Area () and perimeter(). Provide two classes named Triangle and Circle such that each one of the classes implement Shape. Each one of the classes contains only the method Area () and perimeter().that prints the area and perimeter() of the given shape.
package clg.Experiment6;
import java.util.Scanner;

interface shape{
    void Area();
    void perimeter();
    Scanner sc = new Scanner(System.in);
}

class Triangle implements shape{
    
    @Override
    public void Area() {
        double h,b;


      System.out.print("Enter Height of Triangle : ");
      h = sc.nextDouble();

      System.out.print("Enter Base of Triangle : ");
      b = sc.nextDouble();

      System.out.println("Area Of Triangle = "+(0.5*h*b));
    }

    @Override
    public void perimeter() {
        double s1,s2,b;
  
        System.out.print("Enter Side 1 of Triangle : ");
        s1 = sc.nextDouble();
        
        System.out.print("Enter Base of Triangle : ");
        b = sc.nextDouble();
        
        System.out.print("Enter Side 3 of Triangle : ");
        s2 = sc.nextDouble();

        System.out.println("Area Of Triangle = "+(s1+s2+b));
    }
   
}

class circle implements shape{
    
    @Override
    public void Area() {
        final double pie = 3.14;
         double r;
        
        System.out.println("Enter Radius of Circle : ");
        r = sc.nextDouble();
        
        System.out.println("Area Of Circle = "+(pie*r*r));
    }
    
    @Override
    public void perimeter() {
        final double pie = 3.14;
         double r;

         System.out.println("Enter Radius of Circle : ");
         r = sc.nextDouble();
         
         System.out.println("Perimeter Of Circle = "+(2*pie*r));
        
    }

}

public class EX6_1 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.Area();
        t.perimeter();

        circle c = new circle();
        c.Area();
        c.perimeter();
    }
}
