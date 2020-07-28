public class removingElementProblem {

    public static void main(String args[]) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        removingElementProblem rep = new removingElementProblem();
        rep.getEleAfterdelVal(nums,val);
    }

    public void getEleAfterdelVal( int[] nums, int val) {
        int length = nums.length;
        for (int i = 1; i<nums.length; i++) {
            if(nums[i] == 2){

                length++;
            }
        }
        for (int i = 0; i<nums.length;i++) {
            System.out.println(nums[i]);
        }

    }
}
