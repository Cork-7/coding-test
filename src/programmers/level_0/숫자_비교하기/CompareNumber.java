package programmers.level_0.숫자_비교하기;

public class CompareNumber {
    public int solution(int num1, int num2) {
        boolean val = ((0<=num1 && num1<=100) && (0<=num2 && num2 <=100));
        int answer = 0;

        if (num1 == num2) {
            return answer = 1;
        } else if (num1 != num2) {
            return answer = -1;
        }
        return answer;
    }
}
