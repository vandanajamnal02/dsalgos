import sun.jvm.hotspot.memory.SystemDictionary;

public class removingElementProblem {

    public static void main(String args[]) {
        int[] nums = {0, 2, 7, 2, 3};
        int val = 7;
        removingElementProblem rep = new removingElementProblem();
        rep.aa(nums, val);
    }


    int cal(int a[], int val) {
        int noOfOccur = 0;
        for (int tmp : a) {
            if (tmp == val) {
                noOfOccur++;
            }
        }
        return noOfOccur;
    }

    void aa(int ar[], int val) {
        int size = ar.length - cal(ar, val);

        int newAr[] = new int[size];
        int i = 0;

        for (int tmp : ar) {
            if (tmp != val) {
                newAr[i++] = tmp;
            }
        }

        for (int tmp : newAr) {
            System.out.println(" -- " + tmp);
        }
    }

    public void getEleAfterdelVal(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = i + 1; j < nums.length; j++) {
                    System.out.println("j here::: " + nums[j]);
                    nums[j - 1] = nums[j];
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums.length);
        }
    }
}
