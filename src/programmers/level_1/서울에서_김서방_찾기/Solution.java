package programmers.level_1.서울에서_김서방_찾기;

import java.util.Arrays;

class Solution {
    public String solution(String[] seoul) {
        // 1번 방식
//        String target = "Kim";
//
//        for (int i = 0; i < seoul.length; i++) {
//            if (seoul[i].equals(target)) {
//                return "김서방은 " + i + "에 있다";
//            }
//        }
//        return "";

        // 2번 방식
//        int index = Arrays.asList(seoul).indexOf("kim");
//        return "김서방은 " + index + "에 있다";

        // 3번 방식
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                sb.append("김서방은 ");
                sb.append(i);
                sb.append("에 있다");
                break;
            }
        }

        return sb.toString();
    }
}
