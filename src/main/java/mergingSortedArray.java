public class mergingSortedArray<i> {

    public static void main(String args[]){
        int[] nums1 = {1,2,3,0,0,0}; int m = 6;
        int[] nums2 = {2,5,6};      int n = 3;
        mergingSortedArray mr = new mergingSortedArray();
        mr.emptySpace(nums1,6,nums2,3);
    }

    public void emptySpace(int[] nums1, int m, int[] nums2, int n) {

            int receivedIndex=0;

            int nums2Index = 0;

                for(int nums1Index = 0; nums1Index < m-n; nums1Index++){

                    if( nums1[nums1Index] < nums2[nums2Index]){

                        System.out.println("if index+++ "+nums1Index +"  "+nums2Index);

                        receivedIndex = receivedIndex+1;

                        for (int i = nums1.length-2; i >= receivedIndex; i--) {
                            nums1[i + 1] = nums1[i];
                        }
                    }
                    else if (nums1[nums1Index] > nums2[nums2Index]){

                        System.out.println("Else Index ++ "+nums1Index +"  "+nums2Index);
                        receivedIndex = nums1Index;
                        for (int i = nums1.length-2; i >= receivedIndex; i--) {
                            nums1[i + 1] = nums1[i];
                        }
                    } else{


                        }

                    }
                }

    }

