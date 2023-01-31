class Solution {
    public int solution(int n) {
        int answer = 0;
        double sqrtNum = 0;
        if(2 <= n)
            answer++;
        for(int i=1; i<=n; i+=2){
            sqrtNum = Math.sqrt(i);
            if(sqrtNum == (int)sqrtNum)
                continue;
            if(sqrtNum < 2)
                answer++;
            for (int j = 2; j <= (int)sqrtNum; j++) {
                if(i % j == 0)
                    break;
                else {
                    if(j == (int)sqrtNum)
                        answer++;
                }
            }
        }
        return answer;
    }
}