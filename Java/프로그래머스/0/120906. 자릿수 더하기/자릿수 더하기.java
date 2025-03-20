class Solution {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toString(n);
        String[] array = s.split("");
        
        for (int i = 0; i < array.length; i++){
            answer += Integer.parseInt(array[i]);
        }
        return answer;
    }
}