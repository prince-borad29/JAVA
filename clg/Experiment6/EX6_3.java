// Declare a class Vehicle. The Vehicle class derive two_wheeler, three_wheeler and four_wheeler class. Display properties of each type of vehicle using member function of the class. (like speed,fuel type,etc.)
package clg.Experiment6;

class Vehicle{
    void speed(int s){}
    void fuelType(String FT){}
}

class two_wheeler extends Vehicle{
    @Override
    void speed(int s){
        System.out.println("I am Two Wheeler , My Speed is : "+s);
    }

    @Override
    void fuelType(String FT){
        System.out.println("My Fuel Type is : "+FT);
    }
}

class three_wheeler extends Vehicle{
    @Override
    void speed(int s){
        System.out.println("I am Three Wheeler , My Speed is : "+s);
    }

    @Override
    void fuelType(String FT){
        System.out.println("My Fuel Type is : "+FT);
    }
}

class four_wheeler extends Vehicle{
    @Override
    void speed(int s){
        System.out.println("I am Four Wheeler , My Speed is : "+s);
    }

    @Override
    void fuelType(String FT){
        System.out.println("My Fuel Type is : "+FT);
    }
}
public class EX6_3 {
    public static void main(String[] args) {

        two_wheeler v1 = new two_wheeler();
        v1.speed(50);
        v1.fuelType("Petrol");

        three_wheeler v2 = new three_wheeler();
        v2.speed(100);
        v2.fuelType("CNG");

        four_wheeler v3 = new four_wheeler();
        v3.speed(50);
        v3.fuelType("Diesel");

    }
}
