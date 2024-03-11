package mine;
class SB_stringbuilder{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < 26;i++){
            char  ch = (char)(' '+i);
            //s1 = s1 + ch;//bad O(nsquare)
            //Instead use 
            System.out.println(ch);
            sb.append(ch);//will add character to  sb variable
            /*
                Many Methods 
                reverse()
                replace()
                deleteCharAt()
            */
         }
         System.out.println(sb);
    }
}