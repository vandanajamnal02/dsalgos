import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class addingMoreExcerize {

    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};

        int n = arr.length;
        List<Integer> missing = findDisappearedNumbers(arr);
        System.out.print("\n missings :  "+missing);
    }
    public static <Intger> List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> missingEle = new ArrayList<>();
        if(nums==null || nums.length==0){
            return missingEle;
        }
        int n = nums[0];
        int i = 0;
        while(i<nums.length){
            if(nums[i]==n){
                missingEle.add(nums[i]);
                n++;
            }
            i++;

        }
        return missingEle;
    }

}
