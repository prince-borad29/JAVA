public class enum2 {
   public enum Month{
        Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec
    }
    public static void main(String[] args) {
        
        Month[] months = Month.values();
        for (Month m : months) {
            System.out.println(m);
        }
        for (int i = 0; i < months.length; i++) {
            System.out.println("Index Of : "+i+" Value = "+months[i]);
        }
    }
}
