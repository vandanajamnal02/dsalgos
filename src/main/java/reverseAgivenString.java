import java.util.Arrays;

public class reverseAgivenString {

    public static String reverseWords(String s) {

        if(s == null && s.length()==0){
            return null;
        }

        String[] s2 = s.split(" ");

        for(int i =0; i<s2.length/2;i++) {
                String temp = s2[i].trim();
                s2[i] = s2[(s2.length-1)-i].trim();
                s2[(s2.length-1)-i] = temp.trim();
        }

        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < s2.length; i++) {
            if(s2[i].trim().length()>0){
                if(i==0){
                    sb.append(s2[i].trim());
                }
                else{
                    sb.append(" "+s2[i].trim());
                }
            }
        }
        String str = sb.toString().trim();
        return str.trim();
    }

    public static void main(String args[]){
        String s1 ="a good   example";
        String s2 = reverseWords(s1);

        System.out.println(s2);
    }


}
