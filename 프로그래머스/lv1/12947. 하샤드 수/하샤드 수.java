class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int n = x;
        int hashad = 0;
        while (n >= 1) {
            hashad += n % 10;
            n = n / 10;
        }
        answer = x % hashad == 0 ? true : false;
        return answer;
    }
}