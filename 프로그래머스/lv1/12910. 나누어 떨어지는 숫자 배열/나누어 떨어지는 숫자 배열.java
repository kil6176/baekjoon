import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int[] answer = {};
        for(int num : arr){
            if(num % divisor == 0)
                arrayList.add(num);
        }
        if(arrayList.size() != 0)
            answer = arrayList.stream().mapToInt(i -> i).sorted().toArray();
        else
            answer = new int[]{-1};
        return answer;
    }
}