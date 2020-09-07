import java.util.HashMap;
import java.util.Map;

public class uniqueCharInString {

    public static void main(String args[]){

        String s = "leetcode";

        int s1 = firstUniqChar(s);
        System.out.println(s1);


    }

    private static int firstUniqChar(String s) {

        int firstIndex = -1;

        if(s.length()==0){
            return  firstIndex;
        }
        Map<Character,Integer> map = new HashMap<>();
        char[] s1 = s.toCharArray();
        for(char ch : s1){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i)) == 1) {
                firstIndex= i;
                break;
            }
        }
        return firstIndex;
    }

}


