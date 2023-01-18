import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int loopCount = 0;
        int[] fruit = new int[4];

        Scanner scanner = new Scanner(System.in);
        loopCount = scanner.nextInt();
        if(1 <= loopCount && loopCount <= 100000)
        {
            for (int i=0; i < loopCount; i++) {
                switch (scanner.next()) {
                    case "BANANA":
                        fruit[0] += scanner.nextInt();
                        break;
                    case "STRAWBERRY":
                        fruit[1] += scanner.nextInt();
                        break;
                    case "LIME":
                        fruit[2] += scanner.nextInt();
                        break;
                    case "PLUM":
                        fruit[3] += scanner.nextInt();
                        break;
                }
            }
            for (int arr : fruit){
                if(arr == 5){
                    System.out.print("YES");
                    return;
                }
            }
            System.out.print("NO");
        }

    }
}
