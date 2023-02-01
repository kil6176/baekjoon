import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0, num = 0, count = 0;
        char ch = ' ';
        String str = "";
        int[] dartArr = new int[3];

        for (int i = 0; i < dartResult.length(); i++) {
            ch = dartResult.charAt(i);
            if ('0' <= ch && ch <= '9') {
                str += String.valueOf(ch);
                num = Integer.parseInt(str);
            } else if (ch == 'S') {
                dartArr[count++] = num;
                str ="";
            } else if (ch == 'D') {
                dartArr[count++] = num * num;
                str ="";
            } else if (ch == 'T') {
                dartArr[count++] = num * num * num;
                str ="";
            } else if (ch == '*') {
                dartArr[count - 1] *= 2;
                if (count > 1)
                    dartArr[count - 2] *= 2;
            } else if (ch == '#') {
                dartArr[count - 1] *= (-1);
            }
        }
        for (int i: dartArr) {
            answer += i;
        }

        return answer;
    }
}