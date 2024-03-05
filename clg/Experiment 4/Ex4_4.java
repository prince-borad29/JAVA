public class Ex4_4 {
    public static void main(String[] args) {
        System.out.println("Area of circle : "+area(2.3f));
        System.out.println("Area of square : "+area(5));
        System.out.println("Area of triangle : "+area(3.4f,6));
    }
    static float area(float r){
        return 3.14f*(r*r);
    }
    static int area(int side){
        return (side*side);
    }
    static float area(float h,float b){
        return 0.5f*h*b;
    }
}
