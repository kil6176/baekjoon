import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {
    public static void solve(String testcase) throws IOException {
        String[] arrayStr = testcase.split(" ");
        StringBuilder outStr = new StringBuilder();
        int[] arrayNum = new int[Integer.parseInt(arrayStr[0])];
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = i + 1;
        }

        for (int i = 0; i < Integer.parseInt(arrayStr[1]); i++) {
            String[] inputStr = Reader.nextLine().split(" ");
            int start = Integer.parseInt(inputStr[0]) - 1;
            int end = Integer.parseInt(inputStr[1]) - 1;
            while (start < end) {
                int temp = arrayNum[end];
                arrayNum[end] = arrayNum[start];
                arrayNum[start] = temp;
                start++;
                end--;
            }
        }
        for (int num : arrayNum) {
            outStr.append(num + " ");
        }
        Printer.println(outStr);
    }

    public static void solve() throws IOException {

    }

    public static void main(String[] args) throws IOException {
        String T = Reader.nextLine();
        solve(T);
        Printer.close();
    }


    static class Reader {
        public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        public static StringTokenizer st = new StringTokenizer("");

        public static boolean hasNextLine() throws IOException {
            return in.ready();
        }

        public static String nextLine() throws IOException {
            st = new StringTokenizer("");
            return in.readLine();
        }

        public static String next() throws IOException {
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(in.readLine());
            }
            return st.nextToken();
        }

        public static int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public static long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }

    static class Printer {
        public static PrintWriter out = new PrintWriter(System.out);

        public static void println() {
            out.println();
        }

        public static void println(Object object) {
            out.println(object);
        }

        public static void print(Object object) {
            out.print(object);
        }

        public static void close() throws IOException {
            out.close();
        }
    }
}
