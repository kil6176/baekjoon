import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wand = scanner.nextInt();
        int count = 0;

        while (wand!=0){
            count+=wand%2;
            wand/=2;
        }


        System.out.println(count);
    }
}
