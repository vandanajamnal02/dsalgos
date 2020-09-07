import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String args[]) {

        int[] array = {2,2,1};

        int intry = singleNumber(array);

        System.out.println(intry);

    }

    private static int singleNumber(int[] nums) {

        int count = 0;
        int num = 0;

        if(nums ==null && nums.length==0){
           return num;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int a : nums) {

            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
                count++;
            } else {
                if(count>0){
                    num = a;
                }
                map.put(a, 1);
                count++;
            }
        }

        for(Map.Entry<Integer,Integer> mapSet : map.entrySet()) {

            if(mapSet.getValue()==1){
                num=mapSet.getKey();
            }
        }
        return num;

    }
}