import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] emergency) {
        int[] order = IntStream.of(emergency)
            .boxed()
            .sorted(Collections.reverseOrder())
            .mapToInt(value -> value.intValue())
            .toArray();
        
        int[] answer = new int[emergency.length];
        
        for(int i = 0; i < order.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
               if(order[i] == emergency[j]) {
                   answer[j] = i+1;
               }
                   
            }
        }
        
        return answer;
    }
}