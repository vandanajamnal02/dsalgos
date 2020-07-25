public class duplicateZeros {

    public static void main(String args[]){

        int arr[] = {1,0,0,0,3,0};
        duplicateZeros dz = new duplicateZeros();
        dz.duplicateZeros(arr);
    }

    public int checkZeroCount(int a[]){
        int count = 0;
        for(int i = 0; i < a.length; i++ ){
            if(a[i]==0){
                count++;
            }
        }
        return count;
    }

    public void duplicateZeros(int[] arr) {
       int zeroCount = checkZeroCount(arr);
        if ((zeroCount == arr.length) && ((2*zeroCount) >= arr.length)) {
            System.out.println("all ele are zero"+ 2*zeroCount);
        } else {
            int zeroIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    zeroIndex = i;
                    for (int j = arr.length - 2; j > zeroIndex; j--) {
                        arr[j + 1] = arr[j];
                    }
                    if (i+1 <arr.length){
                        arr[i + 1] = 0;
                        i++;
                    }
                }
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Index " + i + " contains " + arr[i]);
            }
        }
    }
}
