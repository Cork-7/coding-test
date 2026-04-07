package programmers.level_0;

// 두 수의 차 구하기
// 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 solution 함수를 완성해주세요.
public class DifferenceTwoNumber {
    public int solution(int num1, int num2) {
//        int answer = 0;
//        if((-50000<= num1 && num1 <= 50000) && (-50000<= num2 && num2 <= 50000)) {
//            answer = num1 - num2;
//        }
        return num1 - num2;
    }

    public static void main(String[] args) {
        DifferenceTwoNumber a = new DifferenceTwoNumber();

        int result = a.solution(1,2);
        System.out.println("결과 값: " + result);
    }
}
