public class plusOneTest {

    public static void main(String[] args) {
        int arr[] = {50,1};
        int n = arr.length;
        int[] count = plusOne(arr);
        for (int c : count){
            System.out.print("\n  is : "+c+ " ");
        }
    }
    public static int[] plusOne(int[] digits) {

        if(digits.length==0 && digits==null){
            int[] temp={1};
            return temp;
        }
        digits[digits.length-1]=digits[digits.length-1]+1;
            return digits;
    }
}
