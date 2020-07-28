public class DeleteingArrayElementAtEnd {

    public static void main(String args[]) {

        int[] intArray = new int[10];

// The array currently contains 0 elements
        int length = 0;

// Add elements at the first 6 indexes of the Array.
        for (int i = 0; i < 6; i++) {
            intArray[length] = i;
            length++;
        }

        for (int i = 0; i  < length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }

        // of the array by 1.
        length--;
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println("Index " + i + " contains after reducing length " + intArray[i]);
//        }

        for (int i = 0; i < length; i++) {
            System.out.println("Index " + i + " contains after reducing length " + intArray[i]);
        }

    }

}
