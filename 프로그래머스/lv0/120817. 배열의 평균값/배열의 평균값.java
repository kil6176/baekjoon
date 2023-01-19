class Solution {
    public static double solution(int[] numbers) {
        double answer = 0;

        for (int arr : numbers) answer += arr;

        return answer/numbers.length;
    }
}