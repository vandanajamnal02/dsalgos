import java.util.LinkedList;
import java.util.List;

public abstract class qwertiesQwerty {


   public static void main(String args[]){
       int number = 123;
       getSum(number);
   }

    private static void getSum(int number) {

       List list = new LinkedList<>();
       while(number >= 0){

           list.add(number%10);
           number = number%10;

       }
       list.forEach((k)->{
           System.out.println(k);
       });

    }


}
