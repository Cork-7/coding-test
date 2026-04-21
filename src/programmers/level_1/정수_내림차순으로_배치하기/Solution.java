package programmers.level_1.정수_내림차순으로_배치하기;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution1(long n) {
        // long 타입 n을 string 타입으로 변환
        String str = Long.toString(n);
        // str을 쪼개 arr에 담음
        String[] arr = str.split("");
        // arr 정렬
        Arrays.sort(arr, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        // arr을 붙이고
        for (String s : arr) {
            sb.append(s);
        }

        // 다시 long 타입으로 변환하여 반환
        return Long.parseLong(sb.toString());
    }

    public long solution2(long n) {
        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        return Long.parseLong(sb.reverse().toString());
    }
}
