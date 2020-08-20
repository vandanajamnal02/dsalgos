public class arrayMountain<highestFrontPeak> {

    public static void main(String args[]){
        double arr[] = {};
        boolean elementFound = validMountainArray(arr);
        System.out.println(elementFound);
    }


    public static boolean validMountainArray(double[] A) {if (A.length <= 2) {
        return false;
    }

        if ((highestFrontPeak(A) == HighestBackPeak(A)) && (highestFrontPeak(A) != 0 && HighestBackPeak(A) != 0)) {
            return true;
        }

        if (lowestStartPeak(A) == lowestEndPeak(A)) {
            return true;
        }
        return false;
    }

    public static int highestFrontPeak(double[] a) {
        int highestFrontPeak1 = -99;

        if (a.length <= 2) {
            return -99;
        }
        if ((a.length > 2) && (a[a.length - 1] > a[a.length - 2])) {
            return -99;
        }

        for (int i = 0; i < a.length - 2; i++) {
            //0,32,40,55,5,4,3,1
            if (a[i] < a[i + 1]) {
                continue;
            } else {
                highestFrontPeak1 = i; //3
                break;
            }
        }
        return highestFrontPeak1;
    }

    public static int HighestBackPeak(double[] a) {
        int HighestBackPeak1 = 0;
        //int arr[] = {0,32,40,55,5,4,3,1};

        for (int i = a.length - 1; i > 0; i--) {
            //4,32,40,55,5,4,3,2,1     size = 9

            if (a[i] < a[i - 1]) {
                continue;
            } else {
                HighestBackPeak1 = i; //3
                break;
            }
        }
        return HighestBackPeak1;
    }

    public static int lowestStartPeak(double[] a) {
        int lowestStartPeak1 = -1;

        for (int i = 0; i < a.length - 2; i++) {
            //0,32,40,55,5,4,3,1
            if (a[i] > a[i + 1]) {
                continue;
            } else {
                lowestStartPeak1 = i; //3
                break;
            }
        }
        return lowestStartPeak1;
    }

    public static int lowestEndPeak(double[] a) {
        int lowestEndPeak1 = -1;
        for (int i = a.length - 1; i > 0; i--) {
            //4,32,40,55,5,4,3,2,1     size = 9

            if (a[i] > a[i - 1]) {
                continue;
            } else {
                lowestEndPeak1 = i; //3
                break;
            }
        }
        return lowestEndPeak1;
    }
}
