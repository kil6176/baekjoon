class Solution {
    public int solution(int n, int k) {
        int kkochiPrice = 12000;
        int drinkPrice = 2000;
        int drinkBonus = n/10; 
        int totalKkochiPrice = n * kkochiPrice;
        int totalDrinkPrice = (k - drinkBonus) * drinkPrice;
        
        int answer = totalKkochiPrice + totalDrinkPrice;
        return answer;
    }
}