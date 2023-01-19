import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        int arrNum[] = new int[inputCount];
        int trueCount = 0;
        
        for (int i=0; i<inputCount;i++)
            arrNum[i] = scanner.nextInt();

        inputCount = scanner.nextInt();
        for (int i=0; i<arrNum.length;i++) {
            if(inputCount == arrNum[i])
                trueCount++;
        }

        System.out.print(trueCount);
    }
}
