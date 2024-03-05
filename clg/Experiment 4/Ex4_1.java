class student{
    String name,city;
     int age;

    void printData(){
        System.out.println("Name : "+this.name);
        System.out.println("City : "+this.city);
        System.out.println("Age : "+this.age+"\n");
    }
}

public class Ex4_1 {
    public static void main(String[] args) {
        student s1 = new student(),s2 = new student();

        s1.name="Prince";
        s1.city="Rajkot";
        s1.age=19;
        s1.printData();

        s2.name="Mayank";
        s2.city="Rajkot";
        s2.age=15;
        s2.printData();
        
    }
}
