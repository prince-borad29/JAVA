public class EX3_6 {
    enum Month{
        Jan , Feb , Mar , Apr , Jun , Jul , Aug , Sep , Oct , Nov , Dec
    }
    public static void main(String[] args) {
        Month[] m = Month.values();
        for (Month v : m) {
            System.out.println(v);
        }
    }
}
