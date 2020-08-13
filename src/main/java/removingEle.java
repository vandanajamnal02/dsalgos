import java.util.Scanner;

public class removingEle {

    public int[] delAtGivenIndex(int[] nums, int i){
        if (i==0){
            // to the left.
            for (i = 1; i < nums.length; i++) {
                nums[i - 1] = nums[i];
            }
        }else if (i == nums.length-1){
            nums[i] = 0;
        }else
        for(i = i+1;i < nums.length; i++){
            nums[i -1] = nums[i];
        }
        return nums;
    }


    public static void main(String [] args){
        removingEle re = new removingEle();
        Scanner takeVar = new Scanner(System.in);
        System.out.println("Tell us arrary size:::: ");
        int length = takeVar.nextInt();
        int nums[] = new int[length];

        System.out.println("Please Enter Elements in Array: ");
        for(int i = 0; i<length;i++) {
            int arrayNumber = takeVar.nextInt();
            nums[i] = arrayNumber;
        }
        int nums1[] = re.delAtGivenIndex(nums,3);

        for(int j = 0; j<nums1.length;j++) {
            System.out.println("  Array: " +nums1[j]);
        }
    }

}
