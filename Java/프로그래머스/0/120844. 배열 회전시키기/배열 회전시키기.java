class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if (direction.equals("right")) {
            for (int i = 0; i < numbers.length; i++) {
                // 현재 인덱스를 기준으로 오른쪽으로 이동 (i - 1)
                answer[(i + 1) % numbers.length] = numbers[i];
            }
        } else { // direction이 "left"인 경우
            for (int i = 0; i < numbers.length; i++) {
                // 현재 인덱스를 기준으로 왼쪽으로 이동 (i + 1)
                answer[i] = numbers[(i + 1) % numbers.length];
            }
        }
        return answer;
    }
}