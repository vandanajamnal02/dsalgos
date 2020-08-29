import java.util.Arrays;

public class minArray {

    public static void main(String args[]){

        int[] A = {1,1};
        int k = 3;

        int asdf = minSubArrayLen(k,A);

       System.out.println(asdf);


    }

    public static int minSubArrayLen(int s, int[] nums) {

        int length_sum = nums.length;
        int min_len = length_sum+1;

        for(int start = 0; start<length_sum;start++){



            int curr_sum = nums[start];


            if(curr_sum>=s){
                return 1;
            }

            for(int end = start+1; end<length_sum; end++){

                System.out.println(curr_sum);

                curr_sum += nums[end];

                if(curr_sum >= s &&(end-start+1)<min_len){
                    //System.out.println(curr_sum);
                    min_len = (end-start+1);
                }

            }

        }
        if(min_len==length_sum+1){
            return 0;
        }
        return min_len;
    }
}
