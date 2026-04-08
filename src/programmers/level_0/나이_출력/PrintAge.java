package programmers.level_0.나이_출력;

public class PrintAge {
    public int solution(int age) {
        boolean val = (0< age && age <=120);
        int answer = 0;
        if (val) {
            answer =  (2022 - age) +1 ;
        }
        return answer;
    }
}
