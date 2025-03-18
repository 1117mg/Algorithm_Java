import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        // Set을 활용하여 s2의 요소들을 저장 (검색 성능 향상)
        HashSet<String> set = new HashSet<>();
        for (String str : s2) {
            set.add(str);
        }
        
        // s1의 원소가 s2에 존재하는지 확인
        for (String str : s1) {
            if (set.contains(str)) { // 문자열 비교는 equals()를 내부적으로 사용
                answer++;
            }
        }
        
        return answer;
    }
}