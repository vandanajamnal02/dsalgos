public class countNumberOfDigits {



    public static void main(String args[]) {
        int nums[] = {555,901,482,1771};
        countNumberOfDigits num = new countNumberOfDigits();
        int datawehave = num.findNumbers(nums);
        System.out.println(datawehave);

    }

    public int findNumbers(int[] nums) {

        int digitWithEven = 0;

        for(int i = 0; i<nums.length; i++){
           if(countInt(nums[i])%2 == 0){
               digitWithEven++;
           };
        }
    return digitWithEven;
    }

    private int countInt(int num) {
        int count = 0;
        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }
        return (count);
    }

}
