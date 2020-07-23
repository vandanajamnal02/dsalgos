public class problemDay1 {

    public int add (int array[], int k){

        String m1 = "";

        for(int i = 0;i<array.length; i++){
            m1 = m1+array[i];
        }
        return Integer.parseInt(m1)+k;
    }
    public static void main(String [] args){
        int a[] = {1,2,3,4};
        int k = 34;

        problemDay1 prob1 = new problemDay1();
        int addedDigit = prob1.add(a,k);
        System.out.println(addedDigit);
    }


}

