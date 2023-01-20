import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ascii = scanner.nextLine();
        System.out.println((int)ascii.charAt(0));
    }
}
