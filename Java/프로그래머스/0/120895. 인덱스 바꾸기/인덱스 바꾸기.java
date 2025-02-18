class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] s = my_string.split("");
        
        String one = s[num1];
        s[num1] = s[num2];
        s[num2] = one;
        
        return String.join("",s);
    }
}