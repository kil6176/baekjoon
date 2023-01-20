import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[7];
        int wand = scanner.nextInt();
        int count = 0;
        int total = 0;
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i == 0) ? 1 : (int) Math.pow(2, i);
        }

        for (int i = arr.length-1; 0<=i; i--) {
            if (!(wand - total < arr[i])) {
                total += arr[i];
                count++;
                if (total == wand)
                    break;
            }
        }

        System.out.println(count);
    }
}
