public class moveZerosInArray {


    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        int n = arr.length;
        moveZeros(arr);
//        int[] result = new int[n];

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    private static void moveZeros(int[] arr) {
        if(arr.length == 0 ){
            System.out.println("no array ele");
        }

        for (int i = 0; i < arr.length; i++){

            if(arr[i] == 0){
                for(int j = i; j<arr.length;j++){
                    if(arr[j]!=0){
                        arr[i] = arr[j];
                        arr[j] = 0;
                        break;
                    }
                }
            }
        }
    }
}
