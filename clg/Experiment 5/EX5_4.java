class Bank{
    void getInteresrRate(){}
}

class ICICI extends Bank{
    void getInteresrRate(){
        System.out.println(getClass().getName()+" : INTEREST RATE IS 8.10%");
    }
}
class SBI extends Bank{
    void getInteresrRate(){
        System.out.println("SBI : INTEREST RATE IS 8.50%");
    }
}
class BOB extends Bank{
    void getInteresrRate(){
        System.out.println("BOB : INTEREST RATE IS 8.90%");
    }
}
public class EX5_4 {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        BOB bob = new BOB();
        ICICI icici =new ICICI();

        sbi.getInteresrRate();
        bob.getInteresrRate();
        icici.getInteresrRate();
    }
}
