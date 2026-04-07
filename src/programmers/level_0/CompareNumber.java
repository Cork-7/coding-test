package programmers.level_0;

// 숫자 비교하기
// 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 return하도록 solution 함수를 완성해주세요.
public class CompareNumber {
    public static void main(String[] args) {
        CompareNumber compareNumber = new CompareNumber();
        int result = compareNumber.solution(2,3);
        System.out.println("결과 값: " + result);
    }

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
