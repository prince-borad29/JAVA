package mine;
public class byteEx {
    public static void main(String[] args) {
        byte a[] = new byte[3];
        a = "ABC".getBytes();

        for(int i=0;i<a.length;i++){
            System.out.println("a["+i+"] = "+a[i]);
        }
    }
}


