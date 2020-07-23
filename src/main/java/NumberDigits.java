public class NumberDigits {

    public int countInt(int num) {
        int count = 0;
        while(num != 0)
        {
            // num = num/10
            num /= 10;
            ++count;
        }
        return (count);
    }
}