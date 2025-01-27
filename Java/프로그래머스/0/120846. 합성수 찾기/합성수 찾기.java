import java.util.Arrays;

class Solution {
    public static int solution(int n) {
        int answer = 0;
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // 모든 수를 소수로 초기화
        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아님

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) { // i가 소수라면
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false; // i의 배수는 합성수로 처리
                }
            }
        }

        for (int i = 4; i <= n; i++) {
            if (!isPrime[i]) { // 소수가 아닌 수는 합성수
                answer++;
            }
        }

        return answer;
    }
}