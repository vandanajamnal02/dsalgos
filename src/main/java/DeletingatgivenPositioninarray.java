public class DeletingatgivenPositioninarray {

    public static void main(String args[]) {

        int[] int_array = new int[10];
        int length = 0;
        for (int i = 0; i < 6; i++) {
            int_array[length] = i;
            length++;
        }

        for (int i = 0; i < length; i++) {
            System.out.println("Index " + i + " contains before reducing length " + int_array[i]);
        }

        // Say we want to delete the element at index 1
        for (int i = 4; i < length; i++) {
            // Shift each element one position to the left
            int_array[i - 1] = int_array[i];
        }
// Again, the length needs to be consistent with the current
// state of the array.
        length--;

        for (int i = 0; i < length; i++) {
            System.out.println("Index " + i + " contains after reducing length " + int_array[i]);
        }

    }

}

