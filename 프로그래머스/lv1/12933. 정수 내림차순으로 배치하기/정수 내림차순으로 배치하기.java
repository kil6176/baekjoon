import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        String number = "";
        while (!(n == 0)){
            arrayList.add((int) (n % 10));
            n /= 10;
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        for(int i = 0 ; i<arrayList.size(); i++){
            number += arrayList.get(i);
        }
        answer = Long.parseLong(number);
        return answer;
    }
}