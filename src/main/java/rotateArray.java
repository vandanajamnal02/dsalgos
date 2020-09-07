public class rotateArray {

    public static void main(String args[]){
        int [] nums = {1,2,3,4,5,6,7};
        int n = 3;
        rotate(nums,n);
    }

    private static void rotate(int[] nums, int n) {
        int temp;

            while (n>0){
                temp = nums[nums.length-1];
                for(int i = nums.length-1 ; i>0; i--){
                    nums[i] = nums[i-1];
                }
                nums[0]=temp;
                n--;
            }


    }

//        public static void rotate(int[] nums, int rotateBy) {
//            int tmp[] = new int[nums.length];
//            int count=1;
//            for(int j=rotateBy+1, i = 0;(j<nums.length && count<=rotateBy); count++,i++,j++){
//                tmp[i] = nums[j];
//            }
//            for(int j= nums.length-rotateBy-1, i=0 ;j<nums.length;i++,j++)
//                {
//                    tmp[j] = nums[i];
//                }
//                nums = tmp;
//            for(int i = 0; i < nums.length;i++){
//                nums[i] = tmp[i];
//                System.out.println(nums[i]);
//            }
//        }
    }

