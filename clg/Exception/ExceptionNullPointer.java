public class ExceptionNullPointer {
    public static void main(String[] args) {
        try{
            String S = null;
            System.out.println("Len = "+S.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        finally{
            System.out.println("I am Always Executed kyoki mai to finally hu..");
        }
    }
}
