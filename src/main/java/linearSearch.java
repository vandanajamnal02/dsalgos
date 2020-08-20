public class linearSearch {

    public static void main(String args[]){
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int n = 100;
        boolean elementFound = linearSearchPro(arr, n);

        System.out.println(elementFound);
    }

    public static boolean linearSearchPro(int[] arr, int number){
        boolean eleFound = false;

        if(arr.length == 0 || number == 0){
             eleFound = false;

        }else {
            for (int i = 0; i< arr.length; i++){
                if(arr[i] == number){
                    eleFound = true;
                }
            }
        }
        return eleFound;

    }
}
