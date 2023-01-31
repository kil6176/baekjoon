import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        ArrayList<Integer> answer = new ArrayList();
        int []rank = {6,6,5,4,3,2,1};
        int unknownCount = 0;
        int winCount = 0;
        //2중 for문
        for(int i=0; i<lottos.length; i++){
            for(int j=0; j<lottos.length; j++) {
                //로또번호가 0이라면
                if (lottos[i] == 0) {
                    unknownCount++;
                    winCount++;
                    break;
                }
                //로또번호가 당첨번호랑 같다면
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