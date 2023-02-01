class Solution {
    public String solution(String s) {
        String answer = "";
        String [] strArray = s.split(" ");
        int max = Integer.parseInt(strArray[0]);
        int min = Integer.parseInt(strArray[0]);
        int temp = 0;
        for (int i = 1; i < strArray.length; i++) {
            temp = Integer.parseInt(strArray[i]);
            if(max <= temp)
                max = temp;
            if(temp <= min)
                min = temp;
        }
        answer = min + " " + max;
        return answer;
    }
}