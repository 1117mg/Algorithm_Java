class Solution {
    public int solution(int hp) {
        int answer = 0;
        answer += hp / 5;  // 5로 나눈 몫을 더함
        hp %= 5;          // 5로 나눈 나머지를 hp에 저장
        answer += hp / 3;  // 3으로 나눈 몫을 더함
        hp %= 3;          // 3으로 나눈 나머지를 hp에 저장
        answer += hp;     // 나머지 hp를 더함 (1개당 1)
        return answer;
    }
}