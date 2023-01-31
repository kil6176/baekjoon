class Solution {
    public String solution(String s, int n) {

        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) <= 'Z' &&  'Z' <  s.charAt(i) + n)
                answer+= (char) ('A' + s.charAt(i) + n -'Z' - 1);
            
            else if('z' < s.charAt(i)+n)
                answer+= (char) ('a' + s.charAt(i) + n -'z' -1);
            
            else if(s.charAt(i) == ' ')
                answer += String.valueOf(s.charAt(i));
            
            else
                answer += String.valueOf((char) (s.charAt(i) + n));
        }
        return answer;
    }
}