public class testingDoubleOfAnElement {

    public static void main(String args[]){
        int arr[] = {7,1,14,11};
        boolean elementFound = doubleChecker(arr);

        System.out.println(elementFound);
    }

    public static boolean doubleChecker(int[] arr){
        boolean eleFound = false;
        if(arr.length == 0){
            eleFound = false;

        }else {
            for (int i = 0; i< arr.length; i++){
               for( int j = i+1; j< arr.length; j++){
                   if(arr[i] != 0 && arr[i] == 2 * arr[j] || arr[j] == 2 * arr[i] ){
                       eleFound = true;
                   }
               }

            }
        }
        return eleFound;
    }
}
