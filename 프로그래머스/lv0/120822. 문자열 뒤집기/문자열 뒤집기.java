class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        StringBuffer strReverse = new StringBuffer(answer);
        answer = strReverse.reverse().toString();
        return answer;
    }
}