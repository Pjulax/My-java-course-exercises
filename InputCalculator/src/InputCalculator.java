import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        boolean isItInt;

        while(true){

            isItInt = scanner.hasNextInt();

            if(isItInt){
                sum += scanner.nextInt();
                count++;
            }else{
                break;
            }

            scanner.nextLine();
        }

        long avg = Math.round( (double)( (double)sum / (double)count ) );
        System.out.println("SUM = " + sum + " AVG = " + avg);

    }
}
