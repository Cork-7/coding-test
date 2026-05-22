package programmers.level_1.수박수박수박수박수박수;

class Solution {
    public String solution(int n) {
       StringBuilder builder = new StringBuilder();
       for(int i = 0; i <= n; i++) {
           builder.append(i % 2 == 0 ? "수" : "박");
       }
       return builder.toString();
    }
}
