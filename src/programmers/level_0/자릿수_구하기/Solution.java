package programmers.level_0.자릿수_구하기;

class Solution {
    public int solution(int N) {
        int answer= 0;

        while (N>0) {
            answer += N%10;
            N/=10;
        }

        return answer;
    }
}
