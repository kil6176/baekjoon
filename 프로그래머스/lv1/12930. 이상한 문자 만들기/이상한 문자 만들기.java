class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        for(int i = 0; i< s.length(); i++){
            answer += count % 2 == 0 ? Character.toUpperCase(s.charAt(i)) : Character.toLowerCase(s.charAt(i));
            count++;
            if(s.charAt(i) == ' ')
                count = 0;
        }
        return answer;
    }
}