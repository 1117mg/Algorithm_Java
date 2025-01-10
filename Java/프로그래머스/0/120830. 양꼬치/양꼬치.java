class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        for (int i = 1; i <= n; i++){
            answer += 12000;
            if(i % 10 == 0){
                if (k > 0){
                    k--;
                }
            }
        }
        
        if (k > 0){
            answer += k*2000;
        }
        
        return answer;
    }
}