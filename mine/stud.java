package mine;
class sDetails{
    int rollno;
    String name;
    String stream;

    public void printSD(){
        System.out.println("Roll No: "+rollno);
        System.out.println("Name :"+name);
        System.out.println("Stream : "+stream);
    }
}
public class stud {
    public static void main(String[] args) {
    sDetails s1 = new sDetails();
    s1.rollno = 11;
    s1.name = "Prince Borad";
    s1.stream = "4BCA-A";
    sDetails s2 = new sDetails();
    s2.rollno = 22;
    s2.name = "Mayank Borad";
    s2.stream = "4BCA-A";
    sDetails s3 = new sDetails();
    s3.rollno = 12;
    s3.name = "Tushar Kacha";
    s3.stream = "4BCA-A";
    sDetails s4 = new sDetails();
    s4.rollno = 15;
    s4.name = "Vansh Bhuva";
    s4.stream = "4BCA-A";
    sDetails s5 = new sDetails();
    s5.rollno = 16;
    s5.name = " jakdsk";
    s5.stream = "4BCA-A";
    
    s1.printSD();
    s2.printSD();
    s3.printSD();
    s4.printSD();
    s5.printSD();
}
}