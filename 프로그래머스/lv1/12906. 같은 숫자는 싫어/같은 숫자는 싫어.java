import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int prevNum = -1;
        for(int num : arr){
            if(prevNum == num)
                continue;
            answer.add(num);
            prevNum = num;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}