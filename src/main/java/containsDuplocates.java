import java.util.HashMap;
import java.util.Map;

public class containsDuplocates {

    public static void main(String args[]) {

        int[] asd = {1,2,3,4};

        Boolean s1 = duplicateContains(asd);

        System.out.println(s1);

    }

    public static boolean duplicateContains(int [] nums){
        Map<Integer,Integer> map = new HashMap<>();
       Boolean num = false;


       if(nums.length==0 && nums == null){
           return num;
       }

       for(int serty : nums){

           if(map.containsKey(serty)){
               num = true;
               break;
           }
            else{
               map.put(serty,1);
           }


       }
        return num;
    }
}
