public class gettingSortedSquareOfAnArray {


    public static void main(String args[]) {
        int a[] = {-4, -1, 0, 3, 10};
        gettingSortedSquareOfAnArray gst = new gettingSortedSquareOfAnArray();
        int arrayText[] = gst.sortedSquares(a);
        System.out.println(arrayText.length);
        for (int text:arrayText) {
            System.out.println(text);
        }
    }

    private int[] sortedSquares(int[] a) {
        a = getSquare(a);
        int min, temp;
        for(int i = 0; i< a.length-1; i++){
            min = i;
            for(int j = i+1; j < a.length; j++){
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        return a;
    }

    public int[] getSquare(int aSquare[]) {
        for(int k = 0; k<aSquare.length;k++ ){
            aSquare[k]=aSquare[k]*aSquare[k];
        }
        return aSquare;
    }
}
