import java.util.Arrays;

class Solution {
    String [] morseArray = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    public String solution(String letter) {
        String [] mos; 
        String answer = "";
        char temp;
        
        mos = letter.split(" ");
        for(String i : mos){
            answer += String.valueOf((char)(Arrays.asList(morseArray).indexOf(i)+'a'));
        }
        
        return answer;
    }
}