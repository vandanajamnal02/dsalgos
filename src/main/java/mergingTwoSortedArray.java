public class mergingTwoSortedArray {

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};

        int m = nums1.length;
        int n = nums2.length;

        merge(nums1, m, nums2,n);

        for (int i = 0; i < nums1.length; i++){
            System.out.print(nums1[i] + " ");
        }

    }

        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int eleInNum1 = m-n;
        if(nums1 == null || nums2 == null || m == 0 || n == 0){
            System.out.println("nothing");
        }

        if(nums1[eleInNum1-1] < nums2[0]){
            for (int i = eleInNum1, j = 0; j < n; i++, j++) {
                nums1[i] = nums2[j];
            }

        }else
            {
            for (int i = 0, j = 0; i < m; ) {

                if (nums2[j] < nums1[i]) {
                    System.out.println("nothing");

                    nums1 = shift(nums1, i);
                    nums1[i] = nums2[j];

                    i++;
                    j++;
                } else {
                    i++;
                }
            }

        }


        }

    public static int[] shift(int[] a, int index) {
        for (int i = a.length - 1; i > index; i--) {
            a[i] = a[i - 1];
        }

        a[index] = 0;
        return a;
    }


}
