class Solution {
    public int solution(int n, int k) {
        int kkochi = 12000;
        int drink = 2000;
        int drinkBonus = n/10; 
        int kkochiMoney = n * kkochi;
        int drinkMoney = (k - drinkBonus) * drink;
        
        int answer = kkochiMoney + drinkMoney;
        return answer;
    }
}