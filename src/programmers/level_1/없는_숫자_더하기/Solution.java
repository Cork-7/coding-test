package programmers.level_1.없는_숫자_더하기;

import java.util.Arrays;

class Solution {
    public int solution1(int[] numbers) {
        int sum = 45;
        for (int number : numbers) {
            sum -= number;
        }
        return sum;
    }

    public int solution2(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }
}
