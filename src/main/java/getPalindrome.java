public class getPalindrome {

    public static void main(String args[]) {

        int digit = 313;


    }

    public void getDigit(int m) {
        int n, sum = 0;

                while(m > 0)

                {

                    n = m % 10;

                    sum = sum + n;

                    m = m / 10;

                }


                System.out.println("Sum of Digits:"+sum);

            }

    }


