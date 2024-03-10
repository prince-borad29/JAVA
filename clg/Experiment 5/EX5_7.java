class This{
    String name;

    This(String name){
        this.name = name;
    // current obj.name = name from parameter
    System.out.println("Name : "+this.name);
    }
}
public class EX5_7 {
    public static void main(String[] args) {
        This obj = new This("THIS");

    }
}
