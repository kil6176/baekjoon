class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = Integer.parseInt(new StringBuffer(Integer.toString(n,3)).reverse().toString(),3);
        return answer;
    }
}