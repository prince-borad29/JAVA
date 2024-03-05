package package1.staicExample;

public class staticBlock {
    static int a = 11,b;

    static{
        System.out.println("Hello I am Static block");
        b = 4;
    }

    public static void main(String[] args){
     //   staticBlock sb = new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);

        staticBlock.b *= 65;

        //staticBlock pr = new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);
    }
}
