import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[] tab = getIntegers();
        printArray(tab);
        tab = sortIntegers(tab);
        printArray(tab);
    }

    private static int[] getIntegers() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you like to enter?");
        int count = input.nextInt();
        int[] tab = new int[count];
        int iter = 0, number;
        while(count > iter){
            System.out.print("Enter integer no." + (iter+1) + " : ");
            number = input.nextInt();
            System.out.print('\n');
            tab[iter] = number;
            iter++;
        }
        return tab;
    }

    private static int[] sortIntegers(int[] old) {
        int[] output = new int[old.length];

        int max = old[0], maxIdx = 0,
            min = old[0], minIdx = 0;
        for(int i=1 ; i<old.length ; i++){
            if(max <= old[i]) {
                max = old[i];
                maxIdx = i;
            }
            else if (min >= old[i]) {
                min = old[i];
                minIdx = i;
            }
        }

        int[] countArr = new int[max - min+1];
        for(int i=0 ; i<old.length ; i++){
            countArr[old[i]-min]++;
            printArray(countArr);
        }

        for(int i=countArr.length-2 ; i>=0 ; i--){
            countArr[i] += countArr[i+1];
            printArray(countArr);
        }

        for(int i=0 ; i<old.length ; i++){
            output[countArr[old[i]-min]-1] = old[i];
            countArr[old[i]-min]--;
            System.out.println("i index is: #" + i);
            printArray(output);
            printArray(countArr);
        }




        return output;
    }

    private static void printArray(int[] tab) {
        for(int i=0 ; i<tab.length ; i++){
            System.out.print("\t" + i);
        }
        System.out.print('\n');
        for(int i=0 ; i<tab.length ; i++){
            System.out.print("\t" + tab[i]);
        }
        System.out.print("\n\n");
    }
}
