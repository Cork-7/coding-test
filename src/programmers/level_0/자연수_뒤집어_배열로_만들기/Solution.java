package programmers.level_0.자연수_뒤집어_배열로_만들기;

class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()] ;

        for (int i=0; i<str.length(); i++) {
            answer[i] = str.charAt(str.length() - 1 - i ) - '0';
        }
        return answer;
    }
}
