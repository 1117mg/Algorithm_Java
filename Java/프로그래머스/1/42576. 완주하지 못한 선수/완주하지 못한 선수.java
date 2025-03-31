import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> raceMap = new HashMap<String, Integer>();
        
        // step01 : 참가자 이름, 수
        for(int i = 0; i < participant.length; i++) {
            if(raceMap.get(participant[i]) != null){
                raceMap.put(participant[i], raceMap.get(participant[i]) + 1);
            } else {
                raceMap.put(participant[i], 0);
            }
        }
        
        // step02 : 완주자 이름, 수 -> -1
        for(int i = 0; i < completion.length; i++){
            raceMap.put(completion[i], raceMap.get(completion[i]) - 1);
        }
        
        
        // step03 : 완주하지 못한 선수
        for(int i = 0; i < participant.length; i++) {
            if(raceMap.get(participant[i]) != -1){
                answer = participant[i];
                break;
            }
        }
        
        return answer;
    }
}