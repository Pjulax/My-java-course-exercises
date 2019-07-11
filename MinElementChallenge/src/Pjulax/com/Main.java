package Pjulax.com;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter how many elements your array will have:");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] array = readIntegers(count);
        System.out.println(Arrays.toString(array) + " and it's minimum is: " + findMin(array));

        System.out.println(findMin(readIntegers(count)));

    }

    private static int[] readIntegers(int count){
        int[] output = new int[count];
        for(int i=0; i<count; i++){
            System.out.print("Enter number:");
            output[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return output;
    }

    private static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

}
