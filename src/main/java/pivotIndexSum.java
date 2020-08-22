import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.List;

public class pivotIndexSum {
    public static void main(String[] args) {
        int arr[] = {-1,-1,0,0,-1,-1};

        int n = arr.length;
        int missing = pivotIndex(arr);
        System.out.print("\n missings :  "+missing);
    }

    public static int pivotIndex(int[] nums) {

        int indexCompare = -1;
        int leftSum= 0;
        int rightSum = 0;
        int i = 0;
        int j = nums.length-1;

        for(int mainIndex = 0; mainIndex<nums.length;mainIndex++){
             leftSum= 0;
             rightSum = 0;
            System.out.println("current i in of array:  "+nums[mainIndex]);
            for(int rightSide = mainIndex+1; rightSide<nums.length; rightSide++){
                rightSum = rightSum+nums[rightSide];
            }
            System.out.println("Sum of right Side ===========> :  "+rightSum);
            for (int leftSide = mainIndex-1; leftSide >=0; leftSide--){
                leftSum = leftSum+nums[leftSide];
            }
            if(rightSum==leftSum){
                indexCompare = mainIndex;
                break;
            }
            System.out.println("Sum of right Side ===============> :  "+leftSum);
        }

        return indexCompare;

    }
}
