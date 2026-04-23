package programmers.level_1.두_정수_사이의_합;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        // 두 정수중 큰수 확인
        int start = Math.min(a,b);
        int end = Math.max(a,b);

        // 작은 수부터 큰수 까지 하니씩 더하기
        for (int i = start; i <= end; i++) {
            answer += i;
        }
        return answer;

        // 등차수열의 합 공식 (양 끝 두 수를 더한 값에 개수를 곱하고 2로 나눈다)
        // 개수 = Math.abs(절대값)(a - b) + 1
        return (long)(a + b)*(Math.abs(a - b) + 1) / 2;
    }
}
