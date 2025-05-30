class Solution {
    public long solution(String numbers) {
        String[] s = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<s.length; i++) {
           numbers = numbers.replaceAll(s[i], String.valueOf(i));
        }
        return Long.parseLong(numbers);
    }
}