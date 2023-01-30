class Solution {
    public int solution(String s) {
        int answer = 0;
        String temp = "";
        String temp2 = "";
        String[] numberStr = {"zero", "one", "two", "three", "four", "five", "six" ,"seven", "eight", "nine"};
        for (int i = 0; i < s.length(); i++) {
            if('0' <= s.charAt(i) && s.charAt(i) <= '9'){
                temp += s.charAt(i);
            }
            else
            {
                temp2 += s.charAt(i);
                for (int j = 0; j < numberStr.length ; j++) {
                    if(temp2.equals(numberStr[j])) {
                        temp += j;
                        temp2 = "";
                    }
                }
            }
        }
        answer = Integer.parseInt(temp);
        return answer;
    }
}