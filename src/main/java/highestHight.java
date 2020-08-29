public class highestHight {

    public static void main(String[] args) {
        int arr[] = {1,1,4,2,1,3};
        int n = arr.length;
        int count = heightChecker(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print("\n"+arr[i] + " ");
        }
        System.out.print("\nCount is : "+count + " ");


    }

    public static int heightChecker(int[] heights) {

        int heightsLength = heights.length;
        int heightCounter = 0;

        int[] doubleHeight = new int[heightsLength];

        if (heightsLength == 0 || heights== null){
            return heightCounter;
        }

        for(int i = 0; i<doubleHeight.length; i++){
            doubleHeight[i] = heights[i];
            System.out.print("\n"+doubleHeight[i] + " \n");
        }

        for(int i = 0; i<doubleHeight.length; i++){

            for(int j = i; j < doubleHeight.length; j++){

                if(doubleHeight[i]>doubleHeight[j]){
                    int temp = doubleHeight[i];
                    doubleHeight[i] = doubleHeight[j];
                    doubleHeight[j]= temp;

                }
            }
            if(heights[i]!=doubleHeight[i]){
                heightCounter++;
            }

        }

        return heightCounter;

    }
}
