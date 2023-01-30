import java.util.regex.*;
class Solution {
    public String solution(String new_id) {
        // 1단계
        String newID = new_id.toLowerCase();
        // 2단계
        newID = newID.replaceAll("[^a-z0-9-_.]", "");
        // 3단계
        newID = newID.replaceAll("\\.{2,}", ".");
        // 4단계
        newID = newID.replaceAll("^\\.|\\.$", "");
        // 5단계
        if (newID.isEmpty()) {
            newID = "a";
        }
        // 6단계
        if (newID.length() >= 16) {
            newID = newID.substring(0, 15);
            
            newID = newID.replaceAll("\\.$", "");
        }
        // 7단계
        while (newID.length() < 3) {
            newID += newID.charAt(newID.length() - 1);
        }
        return newID;
    }
}