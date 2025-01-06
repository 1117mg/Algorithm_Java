class Solution {
    public int solution(int n) {
        int answer = 0;
        int gcd = 0;
        
        for (int i = 1; i <= n; i++){
            if (6 % i == 0 && n % i == 0){
                gcd = i;
            }
        }
        answer = n / gcd;
        
        return answer;
    }
}