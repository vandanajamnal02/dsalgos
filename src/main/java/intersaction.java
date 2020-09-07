import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.*;

public class intersaction {
            public static int[] interSaction(int[] nums1, int[] nums2) {
                List<Integer> nums = new ArrayList<>();
                if(nums1.length==0 || nums2.length==0 || nums1==null || nums2==null){
                    return new int[0];
                }
                int[] result;
                List<Integer> i1 =  new ArrayList<Integer>();
                for(int i =0; i < nums1.length; i++){
                    i1.add(nums1[i]);
                }
                List<Integer> i2 =  new ArrayList<>();
                for(int i =0; i < nums2.length; i++){
                    i2.add(nums2[i]);
                }
                if(i1.size()>i2.size()){
                    i1.retainAll(i2);
                    result = new int[i1.size()];
                    System.out.println();
                    for(int i = 0; i<result.length;i++){
                        result[i] = i1.get(i);
                    }
                }else{
                    i2.retainAll(i1);
                    result = new int[i2.size()];
                    for(int i = 0; i<result.length;i++){
                        result[i] = i2.get(i);
                    }
                }
                return result;
            }
            public static void main(String args[]){

                int nums1[] ={4,9,5};
                int nums2[]= {9,4,9,8,4};
                int[] myresult  = interSaction(nums1,nums2);
                for(int i = 0;i<myresult.length;i++){
                    System.out.println(myresult[i]);
                }
            }
}
