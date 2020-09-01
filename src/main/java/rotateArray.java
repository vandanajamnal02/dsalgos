public class rotateArray {

    public static void main(String args[]){

        int [] nums = {1,2,3,4,5,6,7};
        int n = 3;
        rotate(nums,n);


    }

        public static void rotate(int[] nums, int rotateBy) {

            int tmp[] = new int[nums.length];

            for(int j = nums.length-1,i =0 ; j>rotateBy; i++,j--){

                tmp[i] = nums[j];

            }
            for(int j= nums.length-rotateBy-1, i=0 ;j<nums.length;i++,j++)
            {
                tmp[j] = nums[i];
            }
            nums = tmp;
            for(int k : nums){
                System.out.println(k);
            }
        }



    }

