import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int chess[] = {1, 1, 2, 2, 2, 8};
        Scanner scanner = new Scanner(System.in);
        int inputNumber [] = new int[6];
        String plusMinus = "";

        for(int i=0; i<chess.length; i++){
            inputNumber[i] = scanner.nextInt();
            plusMinus += chess[i] - inputNumber[i] + " ";
        }
        System.out.println(plusMinus);
    }
}
