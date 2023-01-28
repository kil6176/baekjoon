class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuffer sb = new StringBuffer(Integer.toString(n,3));
        answer = Integer.parseInt(sb.reverse().toString(),3);
        return answer;
    }
}