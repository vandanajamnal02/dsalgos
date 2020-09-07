public class reverseSolution {

    public static void main(String args[]){
        int s1 = 1534236469;
        System.out.println(reverse(s1));
    }

    public static int reverse(int x) {


        int reversed = 0;
        int remind =0;
        int prereversed =0;
        Boolean numberflag = false;

        if (x==0){
            return reversed;
        }
        if(x<0){
            numberflag = true;
            x= x*-1;
        }
        while(x>0){
            remind = x%10;
            reversed = reversed*10 + remind;
            if ((reversed - remind)/10 != prereversed) {
                return 0;
            }
            prereversed = reversed;
            x = x/10;
        }
        if(numberflag){
            reversed = reversed * -1;
        }
        return reversed;
    }
}
