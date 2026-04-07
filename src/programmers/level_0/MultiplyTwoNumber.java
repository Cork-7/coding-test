package programmers.level_0;

// 두 수의 곱 구하기
// 정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
public class MultiplyTwoNumber {
    public static void main(String[] args) {
        MultiplyTwoNumber a = new MultiplyTwoNumber();
        int result = a.solution(3, 4);
        System.out.println("결과 값: " + result);
    }

    public int solution(int num1, int num2) {
        return num1 * num2;

//        int answer = 0;
//        if ((0<= num1 && num1<=100) && (0<= num2 && num2<=100)) {
//            answer = num1 * num2;
//        }
//        return answer;
    }
}
