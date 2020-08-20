import java.util.Arrays;

public class maxElementShifting {

    public static void main(String args[]){
        int arr[] = {17,18,5,4,6,1};
        arr = replaceElements(arr);
        for(int j = 0; j < arr.length; j++) {
            System.out.print (" "+arr[j]);
        }
    }

    public static int[] replaceElements(int[] arr) {if (arr.length == 0) {
        return arr;
    }

        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 == arr.length) {
                arr[i] = -1;
            } else {
                arr[i] = largestElement(i + 1, arr, arr[i + 1]);
            }

            int tmp = i + 1;

        }
        return arr;
    }

    public static int largestElement(int index, int[] arr, int largestNumber) {

        for (int j = index; j < arr.length - 1; j++) {
            if (arr[j + 1] > largestNumber) {
                largestNumber = arr[j + 1];
            }
        }
        return largestNumber;
    }
}