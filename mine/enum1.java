public class enum1 {
    public enum Season{
        Winter,
        Summer,
        Monsoon
    }
    public static void main(String[] args) {
        for(Season s: Season.values()){
            System.out.println(s);
        }
        System.out.println("Winter Index : "+Season.valueOf("Winter").ordinal());
    }
}
