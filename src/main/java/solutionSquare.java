import java.util.TreeMap;

public class solutionSquare {

    public static void main(String args[]) {
        int arr[] = {0,1,-1,-1,0};

        System.out.println("----------------> "+ findLargests(arr));
    }

    static int findLargests(int arr[]) {
        int max1 = -1;
        int max2 = -1;

        int index_max1 = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1)
            {
                max2 = max1;

                max1 = arr[i];
                index_max1 =i;
            }
            else if (arr[i] > max2)
            {
                max2 = arr[i];
            }
        }

        System.out.println(" First max >  "+max1);
        System.out.println(" Second max > "+max2);
        System.out.println(max1+ +max2);


        if(max1 > 2*max2)
        {
            return index_max1;
        }
        else{
            return -1;
        }
    }

}


