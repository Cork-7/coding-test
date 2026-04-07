package programmers.level_0;

// 몫 구하기
// 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
public class GetQuotient {
    public static void main(String[] args) {
        GetQuotient a = new GetQuotient();
        int result = a.solution(10,5);
        System.out.println("결과 값: " + result);
    }

    public int solution(int num1, int num2) {
        boolean val = ((0<=num1 && num1<=100) && (0<=num2 && num2 <=100));
        int answer = 0;
        if (val){
            answer = num1 / num2;
        }
        return answer;
    }
}
