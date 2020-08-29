public class parityTestingForOdd {

    public static void main(String[] args) {
        int arr[] = {3,1,2,4};
        int n = arr.length;
        evenOddParityCheck(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static int[] evenOddParityCheck(int[] A) {
            if(A == null || A.length == 0) {
                return A;
            }

            for( int i = 0; i< A.length; i++){

                if(A[i]%2 != 0){
                    for(int j = i; j<A.length;j++){

                        if(A[j]%2 == 0){
                            int temp = A[i];
                            A[i] = A[j];
                            A[j] = temp;
                            break;
                        }

                    }
                }
            }
            return A;

    }


}
