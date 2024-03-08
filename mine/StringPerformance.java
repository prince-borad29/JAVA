package mine;
class StringPerformance{
    public static void main(String[] args){
      String s1  = "";

        // System.out.print("[ ");
      for(int i =0; i < 100;i++){
        char  ch = (char)(' '+i);
        s1 = s1 + ch;//bad O(nsquare)
        // System.out.print(ch+" , ");
    //   System.out.print(" ]");
    }


      
    System.out.println(s1);
}
}