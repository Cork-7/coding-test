package programmers.level_1.제일_작은_수_제거하기;

class Solution {
    public int[] solution(int[] arr) {
        // 배열의 크기가 1인 경우
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 최솟값 찾기
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // 최소값을 제외한 인덱스들을 새로운 배열에 담아 반환
        int[] answer = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[index++] = arr[i];
            }
        }
        return answer;
    }
}
