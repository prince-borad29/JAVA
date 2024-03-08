package mine;
import java.util.Scanner;
class Switch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fruit;

        System.out.println("Enter fruit name : ");
        fruit = sc.next();
       
        switch(fruit){
            case "mango"-> System.out.println("Mango - 50RS each");
            case "apple"->System.out.println("Apple - 30RS each");
            case "kiwi"->System.out.println("Kiwi - 40RS each");
            default->System.out.println("NOT AVAILABLE");       
        }
        sc.close();
        /* 
        switch(day){
            case 1,2,3,4,5 -> System.out.println("Wednesday");//value enter  between 1 to 4 will execute till 5 because there is no break 
            case 6->System.out.println("thursday");
            default->System.out.println("enter valid day");
        }
        */
    } 
}