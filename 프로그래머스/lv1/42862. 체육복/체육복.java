import java.util.*;
class Solution {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        boolean[] arr = new boolean[n+1]; // 체육복 가지고있는사람
        boolean[] reserveArr = new boolean[n+1]; //여벌배열
        ArrayList<Integer> arrayList = new ArrayList<>();
        // 일단 전체 true
        for (int i = 1; i < arr.length; i++) {
            arr[i] = true;
        }

        // 체육복 없는애들 false
        for (int i = 0; i < lost.length; i++) {
            arr[lost[i]] = false;
        }


        //체육복 여벌 있는애들 체크하고 잃어버린애들 true로 바꿔주고 여벌 없애기
        for (int i = 0; i < reserve.length; i++) {
            arrayList.add(reserve[i]);
            if(arr[reserve[i]] == false){
                arrayList.remove(Integer.valueOf(reserve[i]));
                arr[reserve[i]] = true;
            }
        }
        
        //체육복도 있고 여벌도 있는애들 true로 바꾸기
        for (int num : arrayList) {
            reserveArr[num] = true;
        }

        //잃어버린애들 여벌 찾아주기
        for (int i = 1; i <= n; i++) {
            if (arr[i] == false) {
                if (i != 0 && reserveArr[i - 1] == true) {
                    arr[i] = true;
                    reserveArr[i - 1] = false;
                } else if ((i < n)) {
                    if(reserveArr[i + 1] == true) {
                        arr[i] = true;
                        reserveArr[i + 1] = false;
                    }
                }
            }
        }


        for (boolean chk : arr) {
            if (chk)
                answer++;
        }
        return answer;
    }
}