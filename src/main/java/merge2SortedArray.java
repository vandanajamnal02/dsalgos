import java.util.Arrays;

    public class merge2SortedArray {

        private void print(int[] a) {
            for (int tmp : a) {
                System.out.println(tmp);
            }
        }

        private int[] shift(int[] a, int index) {
            for (int i = a.length - 1; i > index; i--) {
                a[i] = a[i - 1];
            }

            a[index] = 0;
            return a;
        }

        void merge(int a[], int b[]) {

            if (a[3] < b[0]) {
                for (int i = 4, j = 0; j < 3; i++, j++) {
                    a[i] = b[j];
                }
            } else {

                for (int i = 0, j = 0; j < b.length; ) {
                    if (b[j] < a[i]) {
                        a = shift(a, i);
                        a[i] = b[j];

                        i++;
                        j++;
                    } else {
                        i++;
                    }
                }
            }

            print(a);
        }


        public static void main(String ar[]) {
            int a[] = {1, 2, 3, 0, 0, 0};
            int b[] = {2,5,6};

            merge2SortedArray ob = new merge2SortedArray();
            ob.merge(a, b);
        }
    }

