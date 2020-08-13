import java.util.Scanner;

public class ExampleToRemoveClass {

    public static void main(String args[]) {

        ExampleToRemoveClass etrc = new ExampleToRemoveClass();
//        Scanner inputData = new Scanner(System.in);
//        System.out.println("enter array length");
//        int arrayLength = inputData.nextInt();
        int[] array1 = {0,1,2,2,3,0,4,2};
//        int[] array = new int[arrayLength];
//        System.out.println("Please Enter Elements in Array: ");
//        for (int i = 0; i < arrayLength; i++) {
//            int arrayNumber = inputData.nextInt();
//            array[i] = arrayNumber;
//        }
        int nums1length = etrc.removeElement(array1, 2);

        for (int j = 0; j < nums1length; j++) {
            System.out.println("  Array that we got finally: " + array1[j]);
        }

    }
    public int removeElement(int[] nums, int val) {
        int length=nums.length;
        if(length==0) return 0;
        int i=0;
        for(int j=0; j<length; j++)
        {
            if(nums[j]!=val)
            {
                nums[i]=nums[j];
                i++;
            }
        }
        if(i<length) nums[i]='\0';
        for (int j = 0; j < nums.length; j++) {
            System.out.println("  Array: " + nums[j]);
        }
        return i;
    }
}