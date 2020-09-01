public class SumOfTwo {

        public static int[] sumOfDigitCompare(int[] array, int targetSum){

            int temp[] =  new int[2];

            if(array.length==0 && array==null){
                return temp;
            }


            for(int i = 0; i< array.length; i++){
                for(int j = i+1; j < array.length; j++){
                    if(array[i]+array[j]==targetSum){
                        temp[0] = i;
                        temp[1] = j;
                    }
                }
            }
            return temp;
        }

    public static void main(String args[]){
        int[] array = {3,2,4};
        int target = 6;
        int[] temp = sumOfDigitCompare(array,target);

        for(int a:temp){
            System.out.println(a);
        }
    }
}
