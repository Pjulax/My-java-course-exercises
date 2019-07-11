package Pjulax.com;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] array = readIntegers(count);
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    private static int[] readIntegers(int count){
        int[] output = new int[count];
        for(int i=0; i<count; i++){
            System.out.print("Enter value: ");
            output[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return output;
    }

    private static void reverse(int[] array){
        int temp;
        for(int i=0; i<array.length/2; i++){
            temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
    }
}
