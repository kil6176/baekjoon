import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int inputCount = scanner.nextInt();
        int arrNum[] = new int[30];

        for (int i=0; i<30;i++)
            arrNum[i] = i+1;

        for (int i=0; i<28;i++)
            arrNum = removeElement(arrNum, scanner.nextInt());
        
        Arrays.sort(arrNum);

        for (int i=0; i<arrNum.length; i++)
            System.out.println(arrNum[i]);
    }
}
