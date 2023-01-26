
import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int[] triangle = Arrays.stream(sides).sorted().toArray();
        if(triangle[2] >= triangle[0] + triangle[1])
            answer = 2;
        else 
            answer = 1;
        return answer;
    }
}