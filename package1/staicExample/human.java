package package1.staicExample;

public class human {
    int age;
    String name;
    char gender;
    static long population;

    human(int age,String name,char gender){
        this.age=age;
        this.name=name;
        this.gender=gender;
        human.population+=1;
    }

    void display(){
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
        System.out.println("Gender : "+this.gender);
        System.out.println("Population : "+human.population);
    }
}
