import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringLength = scanner.nextLine();
        String stringNum = scanner.nextLine();
        int total = 0;
        for (int i=0; i<stringNum.length();i++)
        {
            total += (int)stringNum.charAt(i) - 48;
        }
        System.out.println(total);
    }
}
