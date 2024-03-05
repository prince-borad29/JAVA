import java.util.Scanner;
class nestSwitch{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        String fruit;
        int day=3;
        System.out.println("Enter fruit name : ");
        fruit = sc.next();
        sc.close();
    
        switch(fruit){
            case "mango"-> System.out.println("Mango - 50RS each");
            case "apple"->System.out.println("Apple - 30RS each");
            case "kiwi"->{switch(day){
            case 1,2,3,4,5 -> System.out.println("Wednesday");//value enter  between 1 to 4 will execute till 5 because there is no break 
            case 6->System.out.println("thursday");
            default->System.out.println("enter valid day");
             }}
            default->System.out.println("NOT AVAILABLE");       
        }
    }
}