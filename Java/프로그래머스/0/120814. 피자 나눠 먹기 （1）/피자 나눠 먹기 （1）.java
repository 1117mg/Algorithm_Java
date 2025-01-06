class Solution {
    public int solution(int n) {
        int answer = 1;
        for (int i = 1; i < n; i++){
            if (i % 7 == 0){
                answer++;
            }
        }
        return answer;
    }
}