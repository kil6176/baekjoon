import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] != 0) {
                    arrayList.add(board[j][moves[i] - 1]);
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }
        while (count < arrayList.size()-1) {
            if (arrayList.get(count) == arrayList.get(count + 1)) {
                arrayList.remove(count);
                arrayList.remove(count);
                answer += 2;
                count = 0;
            } else {
                count++;
            }
        }
        return answer;
    }
}