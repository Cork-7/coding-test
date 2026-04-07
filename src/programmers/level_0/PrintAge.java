package programmers.level_0;

// 나이 구하기
// 머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
// 2022년 기준 선생님의 나이 age가 주어질 때, 선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요

public class PrintAge {
    public static void main(String[] args) {
        PrintAge a =  new PrintAge();
        int result = a.solution(40);
        System.out.println("결과 값: " + result);
    }

    public int solution(int age) {
        boolean val = (0< age && age <=120);
        int answer = 0;
        if (val) {
            answer =  (2022 - age) +1 ;
        }
        return answer;
    }
}
