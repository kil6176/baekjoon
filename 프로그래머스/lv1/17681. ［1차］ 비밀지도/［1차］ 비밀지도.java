import java.util.*;
class Solution {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = toBinary(n, arr1[i] | arr2[i]);
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }

    public static String toBinary(int n, int orNum) {
        return String.format("%" + n + "s", Integer.toBinaryString(orNum)).replaceAll(" ", "0");
    }
}