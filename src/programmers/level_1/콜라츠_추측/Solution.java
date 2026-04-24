package programmers.level_1.콜라츠_추측;

class Solution {
    public int solution(int num) {
        // num이 1이면 바로 0을 반환
        if (num == 1) return 0;

        // 오버플로우 방지를 위해 long으로 변환
        long n = (long) num;
        int answer = 0;

        while (n != 1) {

            if (n % 2 == 0) {
                n /= 2;
            }  else {
                n = (n * 3) + 1;
            }
            answer++;

            if (answer >= 500) {
                return -1;
            }
        }
        return answer;
    }
}
