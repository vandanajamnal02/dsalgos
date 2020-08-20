import java.util.Scanner;

public class FindingAverage {
    static int inputNumber = 0 ;

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int OldinputNumber =0;

        FindingAverage av = new FindingAverage();

        for(int averageCount = 1; averageCount <= 50; averageCount++) {
            System.out.println("Take a new number");
            inputNumber = input.nextInt();
            OldinputNumber += inputNumber;
            System.out.println("old value: "+OldinputNumber);
            int newAv = av.average(OldinputNumber, averageCount);
            System.out.println("average :  "+newAv);
        }
    }

    public int average( int averageSum, int number){
        return averageSum/number;
    }

}
