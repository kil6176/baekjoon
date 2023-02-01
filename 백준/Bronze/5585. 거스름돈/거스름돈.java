import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        int money = 1000;
        int count = 0;
        int price = 0;
        Scanner scan = new Scanner(System.in);
        price = scan.nextInt();
        money -= price;
        count += money / 500;
        money %= 500;
        count += money / 100;
        money %= 100;
        count += money / 50;
        money %= 50;
        count += money / 10;
        money %= 10;
        count += money / 5;
        money %= 5;
        count += money / 1;

        System.out.println(count);
    }
}