package package1.OOP.properties.inheritance;

public class box {
     private double h,w,l;

    box(){
        this.h=-1;
        this.w=-1;
        this.l=-1;
    }

    box(double h,double w,double l){
        this.h = h ;
        this.w = w ;
        this.l = l ;
    }

    box(box obj){
        this.h = obj.h ;
        this.w = obj.w ;
        this.l = obj.l ;
    }

    void Display(){
        System.out.print(this.h+" "+this.w+" "+this.l+" ");
    }
}
