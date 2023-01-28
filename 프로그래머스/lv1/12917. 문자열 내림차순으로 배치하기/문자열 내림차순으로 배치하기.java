import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<String> arrayList = new ArrayList<>();
        for(int i=0;i<s.length();i++) { //출력
            arrayList.add(String.valueOf(s.charAt(i)));
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        for(String str : arrayList)
            answer+=str;
        return answer;
    }
}