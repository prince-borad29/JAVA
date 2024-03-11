class EX{
    int a;
    // parameterised constructor
    EX(int a){
        this.a = a;
    }
    //copy constructor
    EX(EX obj){
        this.a = obj.a;
    }
}
public class copyConst {
    EX obj1 = new EX(10);
    EX obj2 = new EX(obj1);
}
