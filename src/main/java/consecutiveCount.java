import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class consecutiveCount {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("how many 0s and 1s do you want to enter?");
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the " + size + " 0s and 1s now.");
        for (int i = 0 ; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println("These are the numbers you have entered.");
        consecutiveCount cs = new consecutiveCount();
        int consCountResult = cs.countingCons(array);
        System.out.println("These cons count : "+consCountResult);
    }
     public Integer countingCons(int[] a) {
         int consecutiveCount = 0;
         ArrayList<Integer> a1 = new ArrayList<Integer>();

         for(int i = 0; i < a.length; i++){
             if(a[i] == 1) {
                 consecutiveCount++;
                 a1.add(consecutiveCount);

             }else{
                 consecutiveCount = 0;
             }
         }
         return(maxEle(a1));
     }

     public int maxEle(ArrayList a1){

         int max = 0;

         for(int i = 0; i < a1.size(); i++) {
             int currentVal = (int) a1.get(i);
             if(currentVal>max)
             {
                 max = currentVal;
             }
         }
         return (max);

     }

    }

