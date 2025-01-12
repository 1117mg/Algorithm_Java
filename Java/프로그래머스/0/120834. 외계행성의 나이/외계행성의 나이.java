class Solution {
    public String solution(int age) {
        String ageString = Integer.toString(age); 
        StringBuilder result = new StringBuilder();
        
        for (char digit : ageString.toCharArray()) {
            int index = digit - '0'; 
            result.append((char) ('a' + index));
        }
        
        return result.toString(); 
    }
}