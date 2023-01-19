public class Main {
    public static void main(String[] args) {

        boolean arr[] = new boolean[10001];

        for(int i=1; i<=10000; i++) {
            int result = getSelfNumber(i);

            if(result<=10000) {
                arr[result] = true;
            }

        }

        for(int i=1; i<arr.length; i++) {
            if(!arr[i]) {
                System.out.println(i);
            }
        }
    }

    public static int getSelfNumber(int num) {
        int sum = num;

        while(num!=0) {
            sum = sum + (num % 10);
            num = num / 10;

            if(sum > 10000) {
                break;
            }
        }
        return sum;
    }
}
