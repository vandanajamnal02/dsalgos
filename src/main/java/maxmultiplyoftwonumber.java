import java.util.Arrays;

public class maxmultiplyoftwonumber {

    public static void main(String args[]){
        int [] asdf = {};
        maxmultiplyoftwonumber newText = new maxmultiplyoftwonumber();
        int[]resutl = newText.returnNumberMaxMultiply(asdf);

        for(int i = 0; i<resutl.length;i++){
            if(resutl[0] == 0){
                System.out.println("dnt have elements there!!!");
                break;
            }
            System.out.println(resutl[i]);
        }
    }

    public int[] returnNumberMaxMultiply(int[] array) {
        int maxEle[] = new int[2];

        if(array.length == 0 && array == null ){
            maxEle[0] = 0;
            return maxEle;
        }
            Arrays.sort(array);
            if(array.length > 0 && array[0]*array[1] > array[array.length-1]*array[array.length-2]){
                    maxEle[0] = array[0];
                    maxEle[1] = array[1];
            }else if(array.length > 0){
                maxEle[0] = array[array.length-1];
                maxEle[1] = array[array.length-2];
            }
        return maxEle;
    }


}
