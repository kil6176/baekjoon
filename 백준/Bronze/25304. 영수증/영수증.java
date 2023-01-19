import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputMoney = scanner.nextInt();
        int inputCount = scanner.nextInt();
        int totalMoney = 0;

        for (int i=0; i<inputCount;i++)
            totalMoney += scanner.nextInt() * scanner.nextInt();
        if(inputMoney == totalMoney)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
