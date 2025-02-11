import java.util.*;

class Solution {
    public int[] solution(String my_string) {
    
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        
        int[] answer = new int[my_string.length()];
        
        String[] s = my_string.split("");
        
        for(int i=0; i<s.length; i++) {
            answer[i] = Integer.parseInt(s[i]);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}