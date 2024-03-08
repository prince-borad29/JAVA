class Circle{
    final float pie = 3.14f;
    float r;

    Circle(float r){
        this.r = r;
    }
    void area(){
        float ans = pie * this.r * this.r;
        System.out.println("Area of Circle = "+ans);
    }
}

public class EX5_6 {
  public static void main(String[] args) {
    Circle c1 = new Circle(23.2f);
    c1.area();
  }  
}
