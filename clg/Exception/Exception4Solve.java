public class Exception4Solve {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        try{
            a[8] = 21;
            a[5] = 25;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception");
        }
        catch(Exception e){
            System.out.println("Parent Exception Ocuurs");
        }
        finally{
            System.out.println("I am Finally");
        }
    }
}
