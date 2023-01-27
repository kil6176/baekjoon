import java.util.*;
class Solution {
    public int[] solution(int[] arr) {

        int [] answer;
        int min = arr[0];
        ArrayList<Integer> arrayList = new ArrayList<>();

        if(arr.length == 1){
            answer = new int[]{-1};
            return answer;
        }

        for(int num : arr)
            arrayList.add(num);

        //최소값 구하기
        for(int i : arr )  min = Math.min( i, min );
        
        arrayList.remove(Integer.valueOf(min));
        
        answer = arrayList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
        return answer;
    }
}