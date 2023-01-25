import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Integer[] tmp = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp, Collections.reverseOrder());
        answer = tmp[0] * tmp[1];
        return answer;
    }
}