package package1.OOP.properties.inheritance;

public class boxWeight extends box{
    private double weight;

    boxWeight(){
        this.weight = -1;
    }

    boxWeight(double l, double w, double h , double weight){
            super(h,w,l);
            this.weight=weight;
    }

    boxWeight(boxWeight other){
        super(other);
        this.weight = other.weight;
    }

    void Info(){
       Display();
        System.out.print(this.weight);
    }
    
}
