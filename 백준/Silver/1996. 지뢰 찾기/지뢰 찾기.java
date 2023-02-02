import java.util.*;
public class Main{
     public char[][] solution(int N, char[][] ary) {

        char[][] answer = new char[N][N];
        //일단 계산하기 쉽게 모든 배열을 0으로 초기화 시켜줍니다.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                answer[i][j] = '0';
            }
        }

        //전체 탐색을 해서 마인이 있으면 *로 바꿔주고 setMine함수를 이용해 주변에 지뢰가 있다는것을 더해줍니다.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ('1' <= ary[i][j] && ary[i][j] <= '9') {
                    answer[i][j] = '*';
                    answer = setMine(Integer.parseInt(String.valueOf(ary[i][j])), i, j, answer);
                }
            }
        }
        //전체 탐색을 해서 *이 아니고 10이상일 경우 M으로 바꿔줍니다.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (answer[i][j] != '*') {
                    if ('9' < answer[i][j]) {
                        answer[i][j] = 'M';
                    }
                }
            }
        }
        return answer;
    }

    public char[][] setMine(int mineCount, int i, int j, char[][] answer) {
        //배열에 인덱스 넘어가는것을 방지하기위해 i, j가 0인지 혹은 마지막 인지 체크합니다.
        //그리고 주위를 살펴본후 마인이 있던곳인지 아닌지 체크하고 마인이 없던곳이면 mineCount를 더해줍니다.
        if (i != 0) {
            answer[i - 1][j] = answer[i - 1][j] != '*' ? (char) (answer[i - 1][j] + mineCount) : '*';
            if (j != 0)
                answer[i - 1][j - 1] = answer[i - 1][j - 1] != '*' ? (char) (answer[i - 1][j - 1] + mineCount) : '*';
            if (j != answer.length - 1)
                answer[i - 1][j + 1] = answer[i - 1][j + 1] != '*' ? (char) (answer[i - 1][j + 1] + mineCount) : '*';

        }
        if (j != 0)
            answer[i][j - 1] = answer[i][j - 1] != '*' ? (char) (answer[i][j - 1] + mineCount) : '*';
        if (j != answer.length - 1)
            answer[i][j + 1] = answer[i][j + 1] != '*' ? (char) (answer[i][j + 1] + mineCount) : '*';

        if (i != answer.length - 1) {
            answer[i + 1][j] = answer[i + 1][j] != '*' ? (char) (answer[i + 1][j] + mineCount) : '*';
            if (j != 0)
                answer[i + 1][j - 1] = answer[i + 1][j - 1] != '*' ? (char) (answer[i + 1][j - 1] + mineCount) : '*';
            if (j != answer.length - 1)
                answer[i + 1][j + 1] = answer[i + 1][j + 1] != '*' ? (char) (answer[i + 1][j + 1] + mineCount) : '*';
        }
        return answer;
    }

    public static void main(String[] args) {
        Main method = new Main();
        Scanner scanner = new Scanner(System.in);
        String str = "";
        char[][] chars ;
        int N = scanner.nextInt();
        chars = new char[N][N];
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            str = scanner.nextLine();
            for (int j = 0; j < str.length(); j++) {
                chars[i][j] = str.charAt(j);
            }
        }
        chars = method.solution(N, chars);
        for (int i = 0; i < N; i++) {
            str = new String(chars[i]);
            System.out.println(str);
        }
    }
}