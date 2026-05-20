package programmers.level_1.가운데_글자_가져오기;

class Solution {
    public String solution(String s) {
        // 문자열의 크기 즉 'qwer' 이면 4
        int len = s.length();
        int mid = len / 2;

        if (len % 2 == 0) {
            // substring은 end값은 포함하지 않으므로 mid + 1
            return s.substring(mid - 1, mid + 1);
        } else
            // asdfg
            return s.substring(mid, mid + 1);
    }
}
