import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String printString = "";
        char spelling = 'a';
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (spelling == str.charAt(j)) {
                    printString += j + " ";
                    break;
                }
                else{
                    if(j+1 == str.length())
                        printString += (i != 25) ? -1 + " " : -1;
                }
            }
            spelling += 1;
        }
        System.out.println(printString);
    }
}
