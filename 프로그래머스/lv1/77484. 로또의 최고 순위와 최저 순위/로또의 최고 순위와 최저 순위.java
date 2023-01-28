import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        ArrayList<Integer> answer = new ArrayList();
        int []rank = {6,6,5,4,3,2,1};
        int unknownCount = 0;
        int winCount = 0;
        for(int i=0; i<lottos.length; i++){
            for(int j=0; j<lottos.length; j++) {
                if (lottos[i] == 0) {
                    unknownCount++;
                    winCount++;
                    break;
                }
                if (lottos[i] == win_nums[j]) {
                    winCount++;
                    break;
                }
            }
        }
        answer.add(rank[winCount]);
        answer.add(rank[winCount-unknownCount]);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}