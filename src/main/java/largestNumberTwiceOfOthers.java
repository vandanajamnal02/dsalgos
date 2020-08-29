public class largestNumberTwiceOfOthers {

        public static void main(String[] args) {
            int arr[] = {50,1};
            int n = arr.length;
            int count = dominantIndex(arr);
            System.out.print("\n  is : "+count + " ");
        }

        public static int maxElement(int[] nums, int skip){
            int largestElementIndex = 0;
            int maxEle =0;
            if(nums.length ==0 || nums==null){
                return largestElementIndex;
            }
            for (int i =0; i<nums.length;i++){
                if(i==0){
                    maxEle = nums[i];
                }

                if(nums[i]>maxEle && nums[i] != skip){
                    maxEle = nums[i];
                    largestElementIndex = i;
                }
            }
            ;
            return largestElementIndex;
        }

        public static int dominantIndex(int[] nums) {

            int maxEleIndex = maxElement(nums,-999);
            int maxEle = nums[maxEleIndex];
            int secondEleIndex = maxElement(nums, maxEle);
            int secondEle = nums[secondEleIndex];


            if(nums.length==0 || nums == null){
                return maxEleIndex;
            }

            if(nums.length==1){
                return 0;
            }

            if(maxEle >= 2*secondEle){
                return maxEleIndex;
            }else{
                maxEleIndex= -1;
            }

            return maxEleIndex;
        }


}

