class Solution {
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        int leftH = 10;
        int rightH = 12;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                leftH = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                rightH = numbers[i];
            } else {
                if (numbers[i] == 0)
                    numbers[i] = 11;
                int leftDist = Math.abs(numbers[i] - leftH) / 3 + Math.abs(numbers[i] - leftH) % 3;
                int rightDist = Math.abs(numbers[i] - rightH) / 3 + Math.abs(numbers[i] - rightH) % 3;
                if (leftDist < rightDist) {
                    answer += "L";
                    leftH = numbers[i];
                } else if (rightDist < leftDist) {
                    answer += "R";
                    rightH = numbers[i];
                } else {
                    if (hand.equals("right")) {
                        answer += "R";
                        rightH = numbers[i];
                    } else {
                        answer += "L";
                        leftH = numbers[i];
                    }
                }
            }
        }

        return answer;
    }
}