import java.util.Arrays;
import java.util.Collections;


public class thirdMaxNumber {
    public static void main(String[] args) {
        int arr[] = {1,1,1};
        int n = arr.length;
        int count = thirdMax(arr);
        System.out.print("\nmax number third is : "+count + " ");
    }

    public static int thirdMax(int[] nums) {
        int thirdMaxNum = 0 ;

        if(nums.length == 0 || nums == null){
            return 0;
        }
        if(nums.length == 1){
            thirdMaxNum=nums[0];
            return thirdMaxNum;
        }
        Arrays.sort(nums);
        int[] dupe =  new int[nums.length];
        int i = 0;
        int k =0;

        while(i<dupe.length) {
            if (i + 1 == nums.length) {
                dupe[k] = nums[nums.length - 1];
                k++;
                break;
            }
            if (nums[i] != nums[i + 1]) {
                dupe[k] = nums[i];
                k++;
            }else if(dupe==null){
                dupe[k] = nums[i];
                k++;
            }
            i++;
        }

        System.out.println(k);

        if(k>2){
            thirdMaxNum = dupe[k-3];
        }else if(k==2){
            thirdMaxNum= dupe[1];
        }else if(k==1){
            thirdMaxNum= dupe[0];
        }
        return thirdMaxNum;
    }
}
