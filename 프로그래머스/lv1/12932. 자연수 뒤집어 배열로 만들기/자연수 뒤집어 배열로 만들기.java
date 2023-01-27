import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (!(n == 0)){
            arrayList.add((int) (n % 10));
            n /= 10;
        }
        answer = arrayList.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}