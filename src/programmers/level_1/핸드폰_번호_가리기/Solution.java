package programmers.level_1.핸드폰_번호_가리기;

class Solution1 {
    // 1번 풀이
    public String solution(String phone_number) {
        String answer = "";

        for (int i = 0; i < phone_number.length(); i++) {
            if (i < phone_number.length() - 4) {
                answer += "*";
            }  else {
                answer += phone_number.charAt(i);
            }
        }

        return answer;
    }
}

class Solution2 {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.append("*");
        }

        sb.append(phone_number.substring(phone_number.length() - 4));
        return sb.toString();
    }
}
