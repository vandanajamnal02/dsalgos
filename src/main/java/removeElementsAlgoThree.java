public class removeElementsAlgoThree {

    public static void main(String[] args) {
        int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int n = arr.length;
        n = copyWithRemovedDuplicates(arr);
        int[] result = new int[n];

        for (int i = 0; i < n; i++){
            result[i]=arr[i];
            System.out.print(result[i] + " ");
        }

    }

    public static int copyWithRemovedDuplicates(int[] nums) {

        int positionInResult = 0;

        // Check for edge cases.
        if (nums == null || nums.length == 0) {
            return positionInResult;
        }

        // Count how many unique elements are in the Array.
//        int uniqueNumbers = 0;
//        for (int i = 0; i < nums.length; i++) {
//            // An element should be counted as unique if it's the first
//            // element in the Array, or is different to the one before it.
//            if (i == 0 || nums[i] != nums[i - 1]) {
//                uniqueNumbers++;
//            }
//        }

        // Create a result Array.
        //int[] result = new int[uniqueNumbers];

        // Write the unique elements into the result Array.

        for (int i = 0; i < nums.length; i++) {
            // Same condition as in the previous loop. Except this time, we can write
            // each unique number into the result Array instead of just counting them.
            if (i == 0 || nums[i] != nums[i - 1]) {
                nums[positionInResult] = nums[i];
                positionInResult++;
            }
        }
        return positionInResult;
    }
}