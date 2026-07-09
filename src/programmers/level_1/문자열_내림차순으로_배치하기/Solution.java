package programmers.level_1.문자열_내림차순으로_배치하기;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(String.valueOf(arr));

        return sb.reverse().toString();
    }
}
class Solution2 {
    public String solution(String s) {
        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            sb.append(c);
        }

        return sb.reverse().toString();
    }
}