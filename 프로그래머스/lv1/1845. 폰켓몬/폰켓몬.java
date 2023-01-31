
import java.util.Arrays;
class Solution {
    public static int solution(int[] nums) {
        Arrays.sort(nums);
        int answer = 1;
        int temp = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(temp != nums[i]) {
                answer++;
                temp = nums[i];
            }
        }
        if(nums.length/2 < answer){
            answer = nums.length / 2 ;
        }
        return answer;
    }
}